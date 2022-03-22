package ru.job4j.condition;

public class Max {
    public int max(int one, int two) {
        int result = one > two ? one : two;
        return result;
    }

    public int max(int one, int two, int three) {
        int result = one > max(two, three) ? one : max(two, three);
        return result;
    }

    public int max(int one, int two, int three, int four) {
        int result = max(one, two) > max(three, four) ? max(one, two) : max(three, four);
        return result;
    }
}
