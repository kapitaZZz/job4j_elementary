package ru.job4j.inheritance;

public class Engineer extends Profession {
    private Item item;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public Engineer(String name, String surname, String education, String birthday, Item item) {
        super(name, surname, education, birthday);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Engineer whatWillYouDo(String name, boolean hasHelmet) {
        if (hasHelmet) {
            return new Engineer("Sam", "Fisher", "MIT", "15.02.2000", new Item("Hammer"));
        } else {
            return new Engineer("Steve", "Jobs", "School", "06.11.1968", new Item("Rule"));
        }
    }
}
