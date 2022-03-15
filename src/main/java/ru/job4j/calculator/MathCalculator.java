package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return division(first, second) + subtraction(first, second) + sum(first, second) + multiply(first, second);
    }

    public static double sumOfSubtractAndDivision(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfAllOperations(15, 6));
        System.out.println("Результат расчета равен: " + sumOfSubtractAndDivision(23, 12));
    }
}