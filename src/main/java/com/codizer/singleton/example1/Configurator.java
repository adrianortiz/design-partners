package com.codizer.singleton.example1;

public class Configurator {

    private String directory;
    private static Configurator configurator;

    private Configurator(String directory) {
        this.directory = directory;
    }

    public static Configurator getInstance() {

        if (configurator == null) {
            configurator = new Configurator("directory-0");
        }

        return configurator;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }
}
