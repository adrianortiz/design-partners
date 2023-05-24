package com.codizer.facade.example3;

public class ServiceFacade {

    private ServiceValidator sv = new ServiceValidator();
    private ServiceDataBase sdb = new ServiceDataBase();
    private ServiceMail sm = new ServiceMail();

    public void processUser(User user) {
        if (sv.validate(user.getDni())) {
            sdb.save(user);
            sm.send(user.getMail(), "Hi! Welcome to our app.");
        }
    }
}
