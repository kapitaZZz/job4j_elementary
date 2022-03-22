package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        Max maxClass = new Max();
        int left = 1;
        int right = 2;
        int result = maxClass.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then1() {
        Max maxClass = new Max();
        int left = 3;
        int right = 1;
        int result = maxClass.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then0() {
        Max maxClass = new Max();
        int left = 1;
        int right = 1;
        int result = maxClass.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then0() {
        Max maxClass = new Max();
        int one = 5;
        int two = 1;
        int three = 3;
        int result = maxClass.max(one, two, three);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To1To4Then0() {
        Max maxClass = new Max();
        int one = 3;
        int two = 1;
        int three = 6;
        int four = 2;
        int result = maxClass.max(one, two, three, four);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}