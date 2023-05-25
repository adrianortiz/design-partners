package com.codizer.creational.abstractfactory;

public class AmericaShirt extends Shirt {

    @Override
    public void imprimir() {
        System.out.println("America shirt shield");
        System.out.println(getNumber());
        System.out.println(getPlayer());
        System.out.println("Little America shirt shield");
    }

}
