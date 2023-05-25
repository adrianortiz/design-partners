package com.codizer.creational.abstractfactory;

public class Main02 {

    public static void main(String[] args) {

        ClothesFactory factory = ClothesFactory.getInstance("Chivas");

        Shirt s = factory.getShirt();
        s.setNumber(1);
        s.setPlayer("Player X");
        s.imprimir();

        Pants p = factory.getPants();
        p.setNumber(1);
        p.imprimir();

        System.out.println("********************");

        ClothesFactory factory2 = ClothesFactory.getInstance("America");

        Shirt s2 = factory.getShirt();
        s2.setNumber(10);
        s2.setPlayer("Player Y");
        s2.imprimir();

        Pants p2 = factory.getPants();
        p2.setNumber(10);
        p2.imprimir();
    }

}
