package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UserDao;
import com.company.entities.concretes.User;

import java.util.List;

public class HomeworkUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Eklendi " + user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Güncellendi " + user.getFirstName());

    }

    @Override
    public void delete(User user) {
        System.out.println("Silindi " + user.getFirstName());

    }

    @Override
    public User getUserByMail(String mail) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
