package com.codizer.creational.singleton.example2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Configurator c = Configurator.getInstance();
            System.out.println(c.getProperty("directory"));
            System.out.println(c.getProperty("url"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
