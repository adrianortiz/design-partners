package com.codizer.creational.iterator.example5;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Backpack backpack = new Backpack();
        backpack.setSpace1("Cellphone");
        backpack.setSpace2("Bottle of water");
        backpack.setSpace3("Bread");
        backpack.setSpace4("Pecil");

        Iterator<String> iterator = backpack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = backpack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String space : backpack) {
            System.out.println(space);
        }
    }
}
