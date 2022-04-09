package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TestTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = ru.job4j.lambda.Test.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuatroFunction() {
        List<Double> result = ru.job4j.lambda.Test.diapason(5, 8, x -> 2 * (x * x) + 1);
        List<Double> expected = Arrays.asList(51D, 73D, 99D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenPowFunction() {
        List<Double> result = ru.job4j.lambda.Test.diapason(5, 8, x -> 2 * Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(65D, 129D, 257D);
        assertThat(result, is(expected));
    }
}
