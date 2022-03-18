package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {7, 15, 3, 5, 11};
        int el = 10;
        int res = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 10, 12};
        int element = 8;
        int start = 3;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexInRange(input, element, start, finish);
        Assert.assertEquals(expected, result);
        /*Дописать тест, когда элемент 8 в диапазоне не найден. Можно искать любой другой элемент, корректно отражая этот факт в названии теста.*/
    }
}