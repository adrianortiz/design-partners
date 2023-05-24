package com.codizer.creational.singleton.example1;

public class Main {

    public static void main(String[] args) {

        Configurator c1 = Configurator.getInstance();
        c1.setDirectory("directory-1");
        System.out.println(c1.getDirectory());

        Configurator c2 = Configurator.getInstance();
        c1.setDirectory("directory-2");
        System.out.println(c2.getDirectory());

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getDirectory());
        System.out.println(c2.getDirectory());

    }
}
