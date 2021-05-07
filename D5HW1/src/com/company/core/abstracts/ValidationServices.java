package com.company.core.abstracts;

import com.company.entities.concretes.User;

public interface ValidationServices {
    void sendValidMail(User user);
    void verifyMail(User user);
}
