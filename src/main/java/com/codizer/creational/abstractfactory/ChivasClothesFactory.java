package com.codizer.creational.abstractfactory;

public class ChivasClothesFactory extends ClothesFactory {

    @Override
    public Shirt getShirt() {
        return new ChivasShirt();
    }

    @Override
    public Pants getPants() {
        return new ChivasPants();
    }

}
