package ru.job4j.early;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordValidator {

    private static List<String> words;

    public static String validate(String password) {
        words = new ArrayList<>(Arrays.asList("qwerty", "12345", "password", "admin", "user"));
        if (password.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (String s : words) {
            if (s.contains(password.toLowerCase())) {
                return "Введен пароль есть базе - " + password;
            }
        }
        if (password.length() < 8 || password.length() > 32) {
            return "Неверная длина пароля, должен быть длиной от 8 до 32 символов.";
        }
        char[] chars = password.toCharArray();
        String low = password.toLowerCase();
        String up = password.toUpperCase();
        if (low.equals(password)) {
            return "Пароль не содержит символов в верхнем регистре.";
        }
        if (up.equals(password)) {
            return "Пароль не содержит символов в нижнем регистре.";
        }
        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                continue;
            }
            return "Не содержит спецсимволы.";
        }
        return password;
    }
}
