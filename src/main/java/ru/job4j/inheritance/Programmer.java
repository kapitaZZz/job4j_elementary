package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String profile;

    public Programmer(String name, String surname, String education, String birthday, String profile) {
        super(name, surname, education, birthday);
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Programmer lifeCycle(String name) {
        return switch (name) {
            case "Backend" -> new Programmer("Steve", "Voznyak", "MIT", "13.04.1990", "Backend developer");
            case "Frontend" -> new Programmer("John", "Anderson", "School #123", "24.09.1997", "Frontend developer");
            default -> new Programmer("NULL", "NULL", "NULL", "NULL", "SQL administrator");
        };
    }
}
