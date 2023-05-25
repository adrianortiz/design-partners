package com.codizer.creational.prototype;

public class Main {

    public static void main(String[] args) {

        Document d1 = new Document();
        d1.setParagraph1("How are you?");
        d1.setParagraph2("I'm great!");

        Document d2 = (Document) d1.clone();
        d2.setParagraph2("blablabla");
        System.out.println(d2.getParagraph1());
        System.out.println(d2.getParagraph2());
    }
}
