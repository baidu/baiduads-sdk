package com.baidu.dev2.maven.plugins;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static final String SOURCES_COPY_DIR = "sources-copy";

    public static final String FILE_MAPPING_FILENAME = "file-path-mapping.json";

    public static final String SDK_PARENT_MODULE_NAME = "baiduads-sdk-parent";

    public static final String SDK_MODULE_NAME = "baiduads-sdk";

    public static final String SDK_AUTO_MODULE_NAME = "baiduads-sdk-auto";

    public static final String SDK_THIRDPARTY_MODULE_NAME = "baiduads-sdk-thirdparty";

    public static final String BUILD_DIR_NAME = "target";

    public static final String POM_FILE_NAME = "pom.xml";

    public static final String DEPLOY_PLUGIN_GROUP_ID = "org.apache.maven.plugins";

    public static final String DEPLOY_PLUGIN_ARTIFACT_ID = "maven-deploy-plugin";

    public static final String NEXUS_STAGING_PLUGIN_GROUP_ID = "org.sonatype.plugins";

    public static final String NEXUS_STAGING_PLUGIN_ARTIFACT_ID = "nexus-staging-maven-plugin";

    public static final String SKIP_NEXUS_STAGING_DEPLOY_MOJO = "skipNexusStagingDeployMojo";

    public static final String CONF = "configuration";

    public static final String SKIP_CONF_PROP = "skip";

    public static final String JAVA_FILE_SUFFIX = ".java";

    public static final String IMPORT_LINE_PREFIX = "import ";

    public static final String NULLABLE_ANNOTATION = "@javax.annotation.Nullable";

    public static final String REPLACE_NULLABLE_ANNOTATION =
            "@com.baidu.dev2.thirdparty.javax.annotation.Nullable";


    public static Map<String, String> importPrefixMapping = new HashMap<>();

    static {
        // ps: 这里的映射关系要与 baiduads-sdk-thirdparty 的 jarjar 配置相同
        importPrefixMapping.put("org.apache.commons.codec.", "com.baidu.dev2.thirdparty.commons.codec.");
        importPrefixMapping.put("org.apache.commons.logging.", "com.baidu.dev2.thirdparty.commons.logging.");
        importPrefixMapping.put("org.apache.http.", "com.baidu.dev2.thirdparty.http.");
        importPrefixMapping.put("com.fasterxml.jackson.annotation.",
                "com.baidu.dev2.thirdparty.jackson.annotation.");
        importPrefixMapping.put("com.fasterxml.jackson.core.", "com.baidu.dev2.thirdparty.jackson.core.");
        importPrefixMapping.put("com.fasterxml.jackson.databind.",
                "com.baidu.dev2.thirdparty.jackson.databind.");
        importPrefixMapping.put("com.fasterxml.jackson.datatype.",
                "com.baidu.dev2.thirdparty.jackson.datatype.");
        importPrefixMapping.put("com.fasterxml.jackson.jaxrs.", "com.baidu.dev2.thirdparty.jackson.jaxrs.");
        importPrefixMapping.put("com.fasterxml.jackson.module.", "com.baidu.dev2.thirdparty.jackson.module.");
        importPrefixMapping.put("javax.activation.", "com.baidu.dev2.thirdparty.javax.activation.");
        importPrefixMapping.put("javax.annotation.", "com.baidu.dev2.thirdparty.javax.annotation.");
        importPrefixMapping.put("javax.xml.bind.", "com.baidu.dev2.thirdparty.javax.xml.bind.");
        importPrefixMapping.put("io.swagger.annotations.", "com.baidu.dev2.thirdparty.swagger.annotations.");
    }

}
