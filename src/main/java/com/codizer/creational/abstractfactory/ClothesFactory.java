package com.codizer.creational.abstractfactory;

public abstract class ClothesFactory {

    public abstract Shirt getShirt();
    public abstract Pants getPants();

    public static ClothesFactory getInstance(String type) {
        if (type.equals("Chivas")) {
            return new ChivasClothesFactory();
        } else {
            return new AmericaClothesFactory();
        }
    }

}
