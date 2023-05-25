package com.codizer.creational.abstractfactory;

public class ChivasPants extends Pants {

    @Override
    public void imprimir() {
        System.out.println("Chivas pants shield");
        System.out.println(getNumber());
    }

}
