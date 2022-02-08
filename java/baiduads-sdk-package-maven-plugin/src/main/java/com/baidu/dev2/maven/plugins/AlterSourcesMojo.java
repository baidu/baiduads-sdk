package com.baidu.dev2.maven.plugins;

import static com.baidu.dev2.maven.plugins.Constants.BUILD_DIR_NAME;
import static com.baidu.dev2.maven.plugins.Constants.CONF;
import static com.baidu.dev2.maven.plugins.Constants.DEPLOY_PLUGIN_ARTIFACT_ID;
import static com.baidu.dev2.maven.plugins.Constants.DEPLOY_PLUGIN_GROUP_ID;
import static com.baidu.dev2.maven.plugins.Constants.FILE_MAPPING_FILENAME;
import static com.baidu.dev2.maven.plugins.Constants.IMPORT_LINE_PREFIX;
import static com.baidu.dev2.maven.plugins.Constants.JAVA_FILE_SUFFIX;
import static com.baidu.dev2.maven.plugins.Constants.NULLABLE_ANNOTATION;
import static com.baidu.dev2.maven.plugins.Constants.POM_FILE_NAME;
import static com.baidu.dev2.maven.plugins.Constants.REPLACE_NULLABLE_ANNOTATION;
import static com.baidu.dev2.maven.plugins.Constants.SDK_AUTO_MODULE_NAME;
import static com.baidu.dev2.maven.plugins.Constants.SDK_MODULE_NAME;
import static com.baidu.dev2.maven.plugins.Constants.SDK_PARENT_MODULE_NAME;
import static com.baidu.dev2.maven.plugins.Constants.SDK_THIRDPARTY;
import static com.baidu.dev2.maven.plugins.Constants.SKIP_CONF_PROP;
import static com.baidu.dev2.maven.plugins.Constants.SOURCES_COPY_DIR;
import static com.baidu.dev2.maven.plugins.Constants.importPrefixMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.maven.model.Build;
import org.apache.maven.model.Dependency;
import org.apache.maven.model.Exclusion;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.util.xml.Xpp3Dom;

@Mojo(name = "alter-sources",
        defaultPhase = LifecyclePhase.PROCESS_SOURCES, requiresProject = true)
public class AlterSourcesMojo extends AbstractSdkMojo {

    @Override
    protected void action(MavenProject project) throws MojoExecutionException {
        try {
            String artifactId = project.getArtifactId();

            if (SDK_PARENT_MODULE_NAME.equals(artifactId)) {

                File basedir = project.getBasedir();

                File sdkDir = new File(basedir, SDK_MODULE_NAME);
                File sdkAutoDir = new File(basedir, SDK_AUTO_MODULE_NAME);
                // 处理 sdk
                processSdkModule(sdkDir);

                // 处理 adk-auto
                processSdkAutoModule(sdkAutoDir);
            }

        } catch (Exception e) {
            getLog().error("alter sources ex:" + e);
            throw new MojoExecutionException(e);
        }
    }

    private void processSdkAutoModule(File basedir) throws Exception {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            // build 输出文件夹
            File buildDir = new File(basedir, BUILD_DIR_NAME);

            // 修改文件备份文件夹
            File sourcesCopyDir = new File(buildDir, SOURCES_COPY_DIR);
            // 被修改的文件的 原始路径 <-> 备份路径 映射
            Map<String, String> filePathMapping = new HashMap<>();

            // step1: 修改pom
            // * 添加 baiduads-sdk-thirdparty 依赖
            File pomFile = new File(basedir, POM_FILE_NAME);

            File copyPomFile = new File(sourcesCopyDir, pomFile.getAbsolutePath());
            FileUtils.copyFile(pomFile, copyPomFile);
            filePathMapping.put(pomFile.getAbsolutePath(), copyPomFile.getAbsolutePath());

            MavenXpp3Reader reader = new MavenXpp3Reader();
            MavenXpp3Writer writer = new MavenXpp3Writer();
            inputStream = new FileInputStream(pomFile);
            Model model = reader.read(inputStream);

            // 重新设置依赖:去除其他依赖
            List<Dependency> dependencies = new ArrayList<>();
            // 添加 baiduads-sdk-thirdparty 依赖
            Dependency thirdparty = getThirdPartyDependency(basedir);
            dependencies.add(thirdparty);
            model.setDependencies(dependencies);


            // 设置插件信息
            Build build = model.getBuild();
            if (build == null) {
                build = new Build();
                model.setBuild(build);
            }
            // 设置deploy插件，不让这个模块deploy
            Plugin plugin = new Plugin();
            plugin.setGroupId(DEPLOY_PLUGIN_GROUP_ID);
            plugin.setArtifactId(DEPLOY_PLUGIN_ARTIFACT_ID);
            Xpp3Dom conf = new Xpp3Dom(CONF);
            Xpp3Dom skipConf = new Xpp3Dom(SKIP_CONF_PROP);
            skipConf.setValue(Boolean.TRUE.toString());
            conf.addChild(skipConf);
            plugin.setConfiguration(conf);
            List<Plugin> plugins = new ArrayList<>();
            plugins.add(plugin);
            build.setPlugins(plugins);

            outputStream = new FileOutputStream(pomFile);
            writer.write(outputStream, model);

            // step2: 修改所有的java源代码import信息
            alterImports(basedir, sourcesCopyDir, filePathMapping);
            saveFilePathMapping(buildDir, filePathMapping);
        } finally {
            // 关闭流
            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
        }
    }

    /**
     * 修改 sdk 模块
     */
    private void processSdkModule(File basedir) throws Exception {
        // build 输出文件夹
        File buildDir = new File(basedir, BUILD_DIR_NAME);
        // 修改文件备份文件夹
        File sourcesCopyDir = new File(buildDir, SOURCES_COPY_DIR);
        // 被修改的文件的 原始路径 <-> 备份路径 映射
        Map<String, String> filePathMapping = new HashMap<>();
        // 修改所有的java源代码import信息
        alterImports(basedir, sourcesCopyDir, filePathMapping);
        saveFilePathMapping(buildDir, filePathMapping);
    }

    private void saveFilePathMapping(File buildDir, Map<String, String> filePathMapping) throws Exception {
        PrintWriter printWriter = null;
        try {
            File filePathMappingFile = new File(buildDir, FILE_MAPPING_FILENAME);
            String json = gson.toJson(filePathMapping);
            printWriter = new PrintWriter(filePathMappingFile);
            printWriter.write(json);
            printWriter.flush();
        } finally {
            IOUtils.closeQuietly(printWriter);
        }

    }

    private Dependency getThirdPartyDependency(File basedir) throws Exception {
        InputStream inputStream = null;
        try {
            // 尝试去读取同级目录 baiduads-sdk-thirdparty 下的pom文件，获取依赖信息
            File thirdpartyDir = new File(basedir.getParentFile(), SDK_THIRDPARTY);
            File pomFile = new File(thirdpartyDir, POM_FILE_NAME);
            MavenXpp3Reader reader = new MavenXpp3Reader();
            inputStream = new FileInputStream(pomFile);
            Model model = reader.read(inputStream);

            Dependency thirdparty = new Dependency();
            thirdparty.setGroupId(model.getGroupId());
            thirdparty.setArtifactId(model.getArtifactId());
            thirdparty.setVersion(model.getVersion());

            // 可以不要这些依赖
            List<Exclusion> exclusions = new ArrayList<>();
            Exclusion exclusion = new Exclusion();
            exclusion.setGroupId("*");
            exclusion.setArtifactId("*");
            exclusions.add(exclusion);
            thirdparty.setExclusions(exclusions);

            return thirdparty;
        } finally {
            // 关闭流
            IOUtils.closeQuietly(inputStream);
        }
    }

    private void alterImports(File basedir, File sourcesCopyDir, Map<String, String> filePathMapping) throws Exception {
        Files.walkFileTree(basedir.toPath(), new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path p, BasicFileAttributes attrs) throws IOException {
                File file = p.toFile();
                if (file.isFile() && file.getName().toLowerCase().endsWith(JAVA_FILE_SUFFIX)) {
                    try {
                        doAlterJavaFileImport(file, sourcesCopyDir, filePathMapping);
                    } catch (Exception e) {
                        throw new IOException(e);
                    }
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private void doAlterJavaFileImport(File file, File sourcesCopyDir, Map<String, String> filePathMapping)
            throws Exception {
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {

            getLog().info("start alter java file:" + file.getName());

            // 先备份文件
            File copyFile = new File(sourcesCopyDir, file.getAbsolutePath());
            FileUtils.copyFile(file, copyFile);
            filePathMapping.put(file.getAbsolutePath(), copyFile.getAbsolutePath());

            // 修改import
            scanner = new Scanner(file);
            List<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.startsWith(IMPORT_LINE_PREFIX)) {
                    for (Map.Entry<String, String> mapping : importPrefixMapping.entrySet()) {
                        String origin = mapping.getKey();
                        String replace = mapping.getValue();
                        if (line.contains(origin)) {
                            line = line.replace(origin, replace);
                            break;
                        }
                    }
                }
                // hardcode 特殊处理
                // 特殊处理一下这个注解
                if (line.trim().equals(NULLABLE_ANNOTATION)) {
                    line = REPLACE_NULLABLE_ANNOTATION;
                }
                lines.add(line);
            }

            printWriter = new PrintWriter(file);
            for (String line : lines) {
                printWriter.println(line);
            }
            printWriter.flush();
        } finally {
            IOUtils.closeQuietly(scanner);
            IOUtils.closeQuietly(printWriter);
        }

    }
}
