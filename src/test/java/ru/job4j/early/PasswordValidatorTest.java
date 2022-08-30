package ru.job4j.early;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIfPasswordEmpty() {
        String password = "";
        PasswordValidator.validate(password);
        assertNull(password);
    }

    @Test()
    public void testIfPasswordLengthLessThen8() {
        String password = "asdfg";
        assertEquals(PasswordValidator.validate(password), "Неверная длина пароля, должен быть длиной от 8 до 32 символов.");
    }

    @Test()
    public void testIfPasswordLengthMpreThen32() {
        String password = "qwertyuiopasdfghjklzxcvbnmwsedrfgtyhujmixecrfvtgbyecrfvtgbyhn";
        assertEquals(PasswordValidator.validate(password), "Неверная длина пароля, должен быть длиной от 8 до 32 символов.");
    }

    @Test()
    public void testIfPasswordInBase() {
        List<String> words = new ArrayList<>(Arrays.asList("qwerty", "12345", "password", "admin", "user"));
        String password = "PASSword";
        assertEquals(PasswordValidator.validate(password), "Введен пароль есть базе - " + password);
        assertTrue(words.contains(password.toLowerCase()));
    }

    @Test()
    public void testIfPasswordUpperCase() {
        String password = "QWERT@@YUIOPSDFGHJKL";
        assertEquals(PasswordValidator.validate(password), "Пароль не содержит символов в нижнем регистре.");
    }

    @Test()
    public void testIfPasswordLowerCase() {
        String password = "wertyh@!juksvbasdmada";
        assertEquals(PasswordValidator.validate(password), "Пароль не содержит символов в верхнем регистре.");
    }

    @Test()
    public void testIfPasswordNotContainsSpecial() {
        String password = "wertyFDGHJ@#$NMksvbasdmada";
        assertEquals(PasswordValidator.validate(password), "Не содержит спецсимволы.");
    }
}