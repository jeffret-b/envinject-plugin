package org.jenkinsci.plugins.envinject;

import hudson.util.Secret;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class EnvInjectGlobalPasswordEntry implements Serializable {

    private String name;

    private Secret value;

    @DataBoundConstructor
    public EnvInjectGlobalPasswordEntry(String name, String password) {
        this.name = name;
        this.value = Secret.fromString(password);
    }

    public String getName() {
        return name;
    }

    public Secret getValue() {
        return value;
    }
}