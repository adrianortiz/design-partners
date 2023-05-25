package com.codizer.creational.abstractfactory;

public class AmericaPants extends Pants {

    @Override
    public void imprimir() {
        System.out.println("America pants shield");
        System.out.println(getNumber());
    }

}
