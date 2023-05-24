package com.codizer.singleton;

public class Configurador {

    private String carpeta;
    private static Configurador configurador;

    private Configurador(String carpeta) {
        this.carpeta = carpeta;
    }

    public static Configurador getInstance() {

        if (configurador == null) {
            configurador = new Configurador("carpeta-0");
        }

        return configurador;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }
}
