package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball had been eaten");
        } else {
            System.out.println("Ball had been run");
        }
    }
}
