package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        int dice = new Random().nextInt(3);

        if (dice == 0) {
            System.out.println("YES");
        } else if (dice == 1) {
            System.out.println("NO");
        } else {
            System.out.println("Если честно то я хз");
        }
    }
}
