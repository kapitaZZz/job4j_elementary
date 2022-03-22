package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int teethCount;

    public Dentist(String name, String surname, String education, String birthday, boolean isLicense) {
        super(name, surname, education, birthday, isLicense);
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
