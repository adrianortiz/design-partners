package com.codizer.singleton;

public class Configurador {

    private String carpeta;

    public Configurador() {
    }

    public Configurador(String carpeta) {
        this.carpeta = carpeta;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }
}
