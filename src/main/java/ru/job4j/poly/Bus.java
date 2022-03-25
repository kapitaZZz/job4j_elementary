package ru.job4j.poly;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Drive on roads");
    }

    @Override
    public boolean stopEngine() {
        return false;
    }
}
