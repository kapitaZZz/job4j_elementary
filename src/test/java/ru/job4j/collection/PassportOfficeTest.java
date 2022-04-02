package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void insertTheSameCitizen() {
        Citizen citizen = new Citizen("215465", "John Doe");
        Citizen doublecate = new Citizen("215465", "Agent Smith");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(doublecate);
        Assert.assertThat(office.get(citizen.getPassport()), is(doublecate));
    }

    @Test
    public void testDoublicatePassport() {
        Citizen citizen = new Citizen("215465", "John Doe");
        Citizen doublecate = new Citizen("215465", "Agent Smith");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(doublecate);
        Assert.assertFalse(office.add(doublecate));
    }
}