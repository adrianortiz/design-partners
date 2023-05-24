package com.codizer.singleton;

public class Cofigurador {

    private String carpeta;

    public Cofigurador() {
    }

    public Cofigurador(String carpeta) {
        this.carpeta = carpeta;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }
}
