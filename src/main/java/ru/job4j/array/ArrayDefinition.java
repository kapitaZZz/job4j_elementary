package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Sam Fisher";
        names[1] = "Steve Jobs";
        names[2] = "Tobias Ripper";
        names[3] = "Kevin Mitnick";

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}
