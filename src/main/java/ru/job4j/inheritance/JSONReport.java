package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        String lineSep = System.lineSeparator();
        return "{" + lineSep
                + "\t\"name\" : \"" + name + "\"," + lineSep
                + "\t\"body\" : \"" + body + "\"" + lineSep
                + "}";
    }
}
