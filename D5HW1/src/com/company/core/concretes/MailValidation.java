package com.company.core.concretes;

import com.company.core.abstracts.ValidationServices;
import com.company.entities.concretes.User;

public class MailValidation implements ValidationServices {
    @Override
    public void sendValidMail(User user) {
        System.out.println("Doğrulama epostası gönderildi " + user.getEmail());
    }

    @Override
    public void verifyMail(User user) {
        System.out.println("Başarıyla doğrulanmıştır " + user.getEmail());
    }
}
