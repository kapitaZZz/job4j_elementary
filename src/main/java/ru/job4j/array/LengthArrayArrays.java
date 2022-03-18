package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 12}, {3, 13, 14}, {4, 11, 21, 23}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i].length);
        }
    }
}
