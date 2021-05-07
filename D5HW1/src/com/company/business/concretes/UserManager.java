package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.core.abstracts.ValidationServices;
import com.company.core.concretes.Controls;
import com.company.core.concretes.MailValidation;
import com.company.dataAccess.abstracts.UserDao;
import com.company.dataAccess.concretes.HomeworkUserDao;
import com.company.entities.abstracts.Entity;
import com.company.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    public UserDao userDao = new HomeworkUserDao();
    public ValidationServices validationServices;

    public UserManager() {
    }

    @Override
    public void register(Entity user) {
        if (!Controls.nameControl((User) user)) {
            System.out.println("Ad ve soyad en az iki karakterden olusmalidir.");
        } else if (!Controls.passwordControl((User) user)) {
            System.out.println("Şifre en az 8 karakterden oluşmalıdır.");
        } else if (!Controls.valMailFormat((User) user)) {
            System.out.println("E Posta adresi kabul edilmiyor.");
        } else {
            System.out.println("Kullanici olusturuldu " + ((User) user).getFirstName());
            validationServices = new MailValidation();
            validationServices.sendValidMail((User) user);
            userDao.add((User) user);
        }

    }

    @Override
    public void verifyUser(User user) {
        validationServices = new MailValidation();
        validationServices.verifyMail(user);
    }

    @Override
    public void logIn(User user, String mail, String password) {
        if(user.getEmail().equals(mail) && user.getPassword().equals(password)){
            System.out.println("Giris basarili " + user.getFirstName());
        } else {
            System.out.println("Tekrar deneyiniz");
        }
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
