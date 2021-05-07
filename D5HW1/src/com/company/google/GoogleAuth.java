package com.company.google;

public class GoogleAuth {
    public void register(String email, String password) {
        System.out.println("Google ile kayıt olundu " + email);
    }

    public void login(String email, String password) {
        System.out.println("Goole ile giriş yapıldı " + email);
    }
}
