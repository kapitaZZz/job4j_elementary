package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("mail@gmail.com", "Name Surname Patronymic");
        for (String s : map.keySet()) {
            String value = map.get(s);
            System.out.println(s + " = " + value);
            }
        }
}
