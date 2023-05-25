package com.codizer.structural.facade;

public class User {

    private String dni;
    private String name;
    private String mail;

    public User() {}

    public User(String dni, String name, String mail) {
        this.dni = dni;
        this.name = name;
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
