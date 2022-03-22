package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void correctDistance() {
        Point point1 = new Point(1, 2, 3);
        double res = point1.distance3d(new Point(-7, -2, 4));
        double expected = 9;
        assertEquals(expected, res, 0.001);
    }

    @Test
    public void correctDistance2() {
        Point point1 = new Point(0, -3, 3);
        double res = point1.distance3d(new Point(3, 1, 3));
        double expected = 5;
        assertEquals(expected, res, 0.001);
    }

}