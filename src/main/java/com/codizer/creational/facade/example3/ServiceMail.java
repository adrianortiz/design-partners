package com.codizer.creational.facade.example3;

public class ServiceMail {

    public void send(String mail, String message) {
        System.out.println("Send to " + mail);
        System.out.println("Message: " + message);
    }
}
