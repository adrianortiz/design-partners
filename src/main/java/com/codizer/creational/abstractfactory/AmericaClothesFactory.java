package com.codizer.creational.abstractfactory;

public class AmericaClothesFactory extends ClothesFactory {

    @Override
    public Shirt getShirt() {
        return new AmericaShirt();
    }

    @Override
    public Pants getPants() {
        return new AmericaPants();
    }

}
