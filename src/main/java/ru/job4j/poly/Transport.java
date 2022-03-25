package ru.job4j.poly;

public interface Transport {
    public void run();

    public void passengersCount(int count);

    public double fillTheCar(double fuel);
}
