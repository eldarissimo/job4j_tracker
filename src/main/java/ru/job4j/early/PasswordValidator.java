package ru.job4j.early;

import static java.lang.Character.*;
import static java.lang.Character.isDigit;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        boolean digit = false;
        boolean special = false;
        for (char sign : password.toCharArray()) {
            if (Character.isDigit(sign)) {
                digit = true;
            }
            if (!Character.isDigit(sign) && !Character.isLetter(sign)) {
                special = true;
            }
        }
        if (!digit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!special) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        String[] illegal = {"qwerty", "12345", "password", "admin", "user"};
        for (String s : illegal) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}