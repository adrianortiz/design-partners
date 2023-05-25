package com.codizer.structural.facade;

public class ServiceMail {

    public void send(String mail, String message) {
        System.out.println("Send to " + mail);
        System.out.println("Message: " + message);
    }
}
