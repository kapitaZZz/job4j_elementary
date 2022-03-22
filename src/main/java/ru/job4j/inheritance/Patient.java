package ru.job4j.inheritance;

public class Patient {
    private String name;
    private Diagnosis diagnosis;
    private int teethCount;

    public Patient(String name, Diagnosis diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public Patient(String name, int teethCount) {
        this.name = name;
        this.teethCount = teethCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }
}
