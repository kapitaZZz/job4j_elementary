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
        for (char c : chars) {
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                return "Один из сиволов пароля - спецсимвол.";
            }
        }
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return "Один из символов пароля - цифра.";
            }
        }
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                return "Один из символов пароля - строчная буква.";
            }
        }
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                return "Один из символов пароля - заглавная буква.";
            }
        }
        return password;
    }
}
