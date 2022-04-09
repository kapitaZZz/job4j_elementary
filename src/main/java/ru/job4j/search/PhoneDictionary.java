package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> sortName = person -> person.getName().contains(key);
        Predicate<Person> sortSurname = person -> person.getSurname().contains(key);
        Predicate<Person> sortPhone = person -> person.getPhone().contains(key);
        Predicate<Person> sortAddress = person -> person.getAddress().contains(key);
        Predicate<Person> combine = sortName.or(sortSurname).or(sortPhone).or(sortAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var p : persons) {
            if (combine.test(p)) {
                result.add(p);
            }
        }
        return result;
    }
}

