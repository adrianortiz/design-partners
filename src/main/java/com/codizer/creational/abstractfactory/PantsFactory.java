package com.codizer.creational.abstractfactory;

public class PantsFactory {

    public static Pants getInstance(String type) {
        if (type.equals("Chivas")) {
            return new ChivasPants();
        } else {
            return new AmericaPants();
        }
    }
}
