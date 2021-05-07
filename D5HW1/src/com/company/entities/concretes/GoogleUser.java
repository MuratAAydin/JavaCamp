package com.company.entities.concretes;

import com.company.entities.abstracts.Entity;

public class GoogleUser implements Entity {
    String email;
    String password;

    public void GoogleAuth() {
    }

    public GoogleUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
