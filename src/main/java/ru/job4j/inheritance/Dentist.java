package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int teethCount;

    public Dentist(String name, String surname, String education, String birthday, boolean isLicense, int teethCount) {
        super(name, surname, education, birthday, isLicense);
        this.teethCount = teethCount;
    }

    public int takeNewTeeth(Patient patient, boolean patientPowerless) {
        patient.setTeethCount(32);
        if (patientPowerless) {
            patient.setTeethCount(patient.getTeethCount() - 1);
            return teethCount++;
        } else {
            return this.teethCount;
        }
    }
}
