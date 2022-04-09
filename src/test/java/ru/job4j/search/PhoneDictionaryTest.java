package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void testNotContainThenEmptyList() {
        var dictionary = new PhoneDictionary();
        dictionary.add(new Person("John", "Doe", "+79123456789", "LA"));
        List<Person> newList = dictionary.find("Steve");
        Assert.assertTrue(newList.isEmpty());
    }
}

