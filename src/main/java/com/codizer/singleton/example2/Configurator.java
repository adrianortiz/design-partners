package com.codizer.singleton.example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurator {

    private Properties properties;
    private static Configurator configurator;

    private Configurator() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(new File("src/main/resources/configuration.properties")));
    }

    public String getProperty(String nombre) {
        return properties.getProperty(nombre);
    }

    public static Configurator getInstance() throws IOException {
        if (configurator == null) {
            configurator = new Configurator();
        }

        return configurator;
    }


}
