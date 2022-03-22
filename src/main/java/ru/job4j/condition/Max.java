package ru.job4j.condition;

public class Max {
    public int max(int one, int two) {
        return one > two ? one : two;
    }

    public int max(int one, int two, int three) {
        return one > max(two, three) ? one : max(two, three);
    }

    public int max(int one, int two, int three, int four) {
        return max(one, two) > max(three, four) ? max(one, two) : max(three, four);
    }
}
