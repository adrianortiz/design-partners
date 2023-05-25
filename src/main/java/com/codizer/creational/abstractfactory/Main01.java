package com.codizer.creational.abstractfactory;

public class Main01 {

    public static void main(String[] args) {

        Shirt s = ShirtFactory.getInstance("Chivas");
        s.setNumber(1);
        s.setPlayer("Player X");
        s.imprimir();

        System.out.println("*****************************");
        Shirt s2 = ShirtFactory.getInstance("America");
        s2.setNumber(10);
        s2.setPlayer("Player Y");
        s2.imprimir();

        System.out.println("*****************************");
        Pants p1 = PantsFactory.getInstance("America");
        p1.setNumber(10);
        p1.imprimir();
    }
}
