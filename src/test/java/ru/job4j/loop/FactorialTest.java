package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testCalcIf5Then120() {
        int input = 5;
        int expected = 120;
        int result = Factorial.calc(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCalcIf0Then1() {
        int input = 0;
        int expected = 1;
        int result = Factorial.calc(input);
        Assert.assertEquals(expected, result);
    }
}