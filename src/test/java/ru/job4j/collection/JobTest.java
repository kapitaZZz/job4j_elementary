package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new NameDesc().thenComparing(new PriorityDesc());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new AscName().thenComparing(new PriorityDesc());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new AscName().thenComparing(new PriorityAsc());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void testAscName() {
        Comparator<Job> comparator = new AscName();
        int res = comparator.compare(
                new Job("QWERTY", 0),
                new Job("ZXCVBN", 0)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void testDescName() {
        Comparator<Job> comparator = new NameDesc();
        int res = comparator.compare(
                new Job("QWERTY", 0),
                new Job("ZXCVBN", 0)
        );
        assertThat(res, greaterThan(0));
    }

    @Test
    public void testDescPriority() {
        Comparator<Job> comparator = new PriorityDesc();
        int res = comparator.compare(
                new Job("QWERTY", 4),
                new Job("QWERTY", 1)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void testAscPriority() {
        Comparator<Job> comparator = new PriorityAsc();
        int res = comparator.compare(
                new Job("QWERTY", 4),
                new Job("QWERTY", 1)
        );
        assertThat(res, greaterThan(0));
    }

}