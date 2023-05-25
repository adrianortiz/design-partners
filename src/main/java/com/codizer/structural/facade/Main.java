package com.codizer.structural.facade;

public class Main {

    public static void main(String[] arg) {
        User user = new User("123", "Adrian", "adrian@gmail.com");

        ServiceFacade facade = new ServiceFacade();
        facade.processUser(user);

    }
}
