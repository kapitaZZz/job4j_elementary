package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();

        wolf.eat(ball);
        hare.eat(ball);
        fox.eat(ball);
    }
}
