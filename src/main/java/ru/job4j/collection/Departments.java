package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String parseString = "";
            for (String str : value.split("/")) {
                if (parseString.equals("")) {
                    parseString = str;
                } else {
                    tmp.add(parseString + "/" + str);
                }
            }
            tmp.add(parseString);
        }
        return new ArrayList<>(tmp);
    }
}
