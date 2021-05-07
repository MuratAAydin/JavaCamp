package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.core.abstracts.AuthServices;
import com.company.core.concretes.GoogleAuthAdapter;
import com.company.dataAccess.abstracts.UserDao;
import com.company.dataAccess.concretes.HomeworkUserDao;
import com.company.entities.abstracts.Entity;
import com.company.entities.concretes.GoogleUser;
import com.company.entities.concretes.User;

import java.util.List;

public class AuthManager implements UserService {

    @Override
    public void register(Entity user) {
        AuthServices authServices = new GoogleAuthAdapter();
        authServices.registerWithAuth(((GoogleUser) user).getEmail(), ((GoogleUser)user).getPassword());
    }

    @Override
    public void verifyUser(User user) {
    }

    @Override
    public void logIn(User user, String mail, String password) {
        System.out.println("Google ile giriş yapıldı");
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
