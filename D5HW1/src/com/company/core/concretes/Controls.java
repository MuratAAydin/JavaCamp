package com.company.core.concretes;

import com.company.entities.abstracts.Entity;
import com.company.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controls {


    public static boolean passwordControl(User user) {
        return user.getPassword().length() >= 6;
    }
    public static boolean valMailFormat(Entity user) {
        String regex =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(((User) user).getEmail());
        return matcher.find();
    }

    public static boolean nameControl(User user) {
        return user.getFirstName().length() >= 3 && user.getLastName().length() >= 3;
    }
}
