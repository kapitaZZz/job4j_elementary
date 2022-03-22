package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int bricksPerMinute;

    public Builder(String name, String surname, String education, String birthday, Item item) {
        super(name, surname, education, birthday, item);
    }

    public int getBricksPerMinute() {
        return bricksPerMinute;
    }

    public int setBricksPerMinute(int bricksPerMinute) {
        this.bricksPerMinute = bricksPerMinute;
        return this.bricksPerMinute;
    }

    public int speciality(Builder builder) {
        if (builder.getItem().getName().equals("Hammer")) {
            return builder.setBricksPerMinute(50);
        } else {
            return builder.setBricksPerMinute(10);
        }
    }
}
