package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] listO1 = o1.split("/");
        String[] listO2 = o2.split("/");
        int res = listO2[0].compareTo(listO1[0]);
        return res == 0 ? o1.compareTo(o2) : res;
    }
}
