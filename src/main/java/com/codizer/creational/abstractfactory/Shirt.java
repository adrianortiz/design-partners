package com.codizer.creational.abstractfactory;

public abstract class Shirt {

    private int number;
    private String player;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public abstract void imprimir();
}
