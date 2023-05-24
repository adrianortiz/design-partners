package com.codizer.singleton;

public class Principal {

    public static void main(String[] args) {

        Configurador c1 = Configurador.getInstance();
        c1.setCarpeta("carpeta-1");
        System.out.println(c1.getCarpeta());

        Configurador c2 = Configurador.getInstance();
        c1.setCarpeta("carpeta-2");
        System.out.println(c2.getCarpeta());

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getCarpeta());
        System.out.println(c2.getCarpeta());

    }
}
