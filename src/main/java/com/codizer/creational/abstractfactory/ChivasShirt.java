package com.codizer.creational.abstractfactory;

public class ChivasShirt extends Shirt {

    @Override
    public void imprimir() {
        System.out.println("Chivas shirt shield");
        System.out.println(getNumber());
        System.out.println(getPlayer());
        System.out.println("Little Chivas shirt shield");
    }

}
