package com.codizer.creational.abstractfactory;

public abstract class Pants {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void imprimir();
}
