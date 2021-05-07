package com.company.business.abstracts;

import com.company.entities.abstracts.Entity;
import com.company.entities.concretes.User;

import java.util.List;

public interface UserService {
    void register(Entity user);
    void verifyUser(User user);
    void logIn(User user,String mail,String password);
    List<User> getAll();
}
