package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] val1 = o1.split(". ");
        String[] val2 = o2.split(". ");
        int num1 = Integer.parseInt(val1[0]);
        int num2 = Integer.parseInt(val2[0]);
        int res = Integer.compare(num1, num2);
        return res;
    }
}
