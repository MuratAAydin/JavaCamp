package com.company;

import com.company.business.abstracts.UserService;
import com.company.business.concretes.AuthManager;
import com.company.business.concretes.UserManager;
import com.company.core.concretes.Controls;
import com.company.entities.concretes.GoogleUser;
import com.company.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        User user = new User(1, "Ahmet", "Mehmet", "meherm@ahmet.com", "845864", true) ;
        GoogleUser googleUser = new GoogleUser("email@email.com", "23156456");



        UserService userManager = new UserManager();
        UserService authManager = new AuthManager();

        authManager.register(googleUser);
        userManager.register(user);
        authManager.logIn(user, "asdasd@asdasd.com", "123456");
        userManager.logIn(user, "engin@dasasd.com", "123456");
        userManager.verifyUser(user);

    }
}
