package com.selfpractice.banklab;

public class ValidateAccount {
    public final String MOBILE = "0969277386";
    public final String PASSWORD = "Ngo Van Khoai";

    public boolean checkAccount(String mobile, String password) {
        if (mobile.equals(MOBILE)) {
            if (password.equals(PASSWORD)) {
                System.out.println("Login successfully!");
                return true;
            } else {
                System.out.println("Wrong password, please re-enter");
                return false;
            }
        } else {
            System.out.println("Wrong mobile phone number, please re-enter");
            return false;
        }
    }
}
