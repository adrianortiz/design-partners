package com.codizer.creational.abstractfactory;

public class ShirtFactory {

    public static Shirt getInstance(String type) {

        if (type.equals("Chivas")) {
            return new ChivasShirt();
        } else {
            return new AmericaShirt();
        }
    }
}
