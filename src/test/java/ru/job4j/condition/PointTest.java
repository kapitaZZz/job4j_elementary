package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point = new Point(0, 2);
        double expected = 2;
        double out = point.distance(new Point(0, 0));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to22then1And4() {
        Point point = new Point(2, 2);
        double expected = 1.41;
        double out = point.distance(new Point(1, 1));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to02then2And2() {
        Point point = new Point(3, 1);
        double expected = 2.82;
        double out = point.distance(new Point(1, 3));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to51then2And8() {
        Point point = new Point(3, 5);
        double expected = 1.41;
        double out = point.distance(new Point(2, 4));
        Assert.assertEquals(expected, out, 0.01);
    }
}