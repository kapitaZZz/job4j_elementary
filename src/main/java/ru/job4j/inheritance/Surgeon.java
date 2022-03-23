package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private Item item;

    public Surgeon(String name, String surname, String education, String birthday, boolean isLicense, Item item) {
        super(name, surname, education, birthday, isLicense);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item toOperate(String name) {
        return switch (name) {
            case "Скальпель" -> new Item("scalpel");
            case "Клизма" -> new Item("enema");
            default -> new Item("Axe");
        };
    }
}
