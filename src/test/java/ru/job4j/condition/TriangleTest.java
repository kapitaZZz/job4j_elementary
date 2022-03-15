package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testExist() {
        double ab = 5;
        double ac = 3;
        double bc = 6;
        assertTrue(Triangle.exist(ab, ac, bc));
    }

    @Test
    public void testNotExist() {
        double ab = 1;
        double ac = 1;
        double bc = 5;
        assertFalse(Triangle.exist(ab, ac, bc));
    }
}