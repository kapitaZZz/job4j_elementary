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
    public void testIfPasswordContainsUpperCase() {
        String password = "asDfgasdasda";
        char[] chars = password.toCharArray();
        assertEquals(PasswordValidator.validate(password), "Один из символов пароля - заглавная буква.");
        assertTrue(Character.isUpperCase(chars[2]));
    }

    @Test()
    public void testIfPasswordContainsLowerCase() {
        String password = "ASDfGGHVSDHBFSAAS";
        char[] chars = password.toCharArray();
        assertEquals(PasswordValidator.validate(password), "Один из символов пароля - строчная буква.");
        assertTrue(Character.isUpperCase(chars[2]));
    }

    @Test()
    public void testIfPasswordContainsNumber() {
        String password = "AS2DfGGHVSDHBFSAAS";
        char[] chars = password.toCharArray();
        assertEquals(PasswordValidator.validate(password), "Один из символов пароля - цифра.");
        assertTrue(Character.isDigit(chars[2]));
    }

    @Test()
    public void testIfPasswordContainsSpecialChar() {
        String password = "AS@DfGGHVSDHBFSAAS";
        char[] chars = password.toCharArray();
        assertEquals(PasswordValidator.validate(password), "Один из сиволов пароля - спецсимвол.");
    }

    @Test()
    public void testIfPasswordInBase() {
        List<String> words = new ArrayList<>(Arrays.asList("qwerty", "12345", "password", "admin", "user"));
        String password = "PASSword";
        assertEquals(PasswordValidator.validate(password), "Введен пароль есть базе - " + password);
        assertTrue(words.contains(password.toLowerCase()));
    }
}