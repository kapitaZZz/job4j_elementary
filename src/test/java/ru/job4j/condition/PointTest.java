package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to22then1And4() {
        double expected = 1.41;
        int x1 = 3;
        int x2 = 1;
        int y1 = 2;
        int y2 = 2;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to02then2And2() {
        double expected = 2.23;
        int x1 = 1;
        int x2 = 4;
        int y1 = 0;
        int y2 = 2;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to51then2And8() {
        double expected = 2.82;
        int x1 = 3;
        int x2 = 3;
        int y1 = 5;
        int y2 = 1;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}