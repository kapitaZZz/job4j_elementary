package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public static int sum(int num) {
        return x + num;
    }

    public int multiply(int num) {
        return x * num;
    }

    public int sumAllOperation(int num) {
        return sum(num) + divide(num) + multiply(num) + minus(num);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(minus(7));

        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(15));
        System.out.println(calculator.multiply(2));
        System.out.println(calculator.sumAllOperation(15));
    }
}
