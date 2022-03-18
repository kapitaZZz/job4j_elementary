package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void testSumNumbersWhenNumIsEven() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int result = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, result);

    }

}