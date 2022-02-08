package com.baidu.dev2.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import com.google.gson.Gson;

public abstract class AbstractSdkMojo extends AbstractMojo {

    /**
     * default true; means skip this mojo execte
     */
    @Parameter(property = "baidusdk-package.skip", defaultValue = "true")
    private boolean skip = true;

    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    static Gson gson = new Gson();

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (skip) {
            getLog().info("baidusdk-package skip");
            return;
        }
        action(project);
    }

    /**
     * need sub class to implement
     *
     * @param project
     */
    protected abstract void action(MavenProject project) throws MojoExecutionException;
}
