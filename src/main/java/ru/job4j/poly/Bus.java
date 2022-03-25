package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void run() {
        System.out.println("Gonna drive, keep rollin' baby");
    }

    @Override
    public void passengersCount(int count) {
        System.out.println(count + " inside this can");
    }

    @Override
    public double fillTheCar(double fuel) {
        return fuel * 45.50;
    }
}
