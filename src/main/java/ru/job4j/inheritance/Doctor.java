package ru.job4j.inheritance;

public class Doctor extends Profession {
    private Diagnosis diagnosis;
    private boolean isLicense;

    public Doctor(String name, String surname, String education, String birthday, boolean isLicense) {
        super(name, surname, education, birthday);
        this.isLicense = isLicense;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public boolean isLicense() {
        return isLicense;
    }

    public void setLicense(boolean license) {
        isLicense = license;
    }

    public Patient heal(Diagnosis diagnosis) {
        return new Patient("Steve", diagnosis);
    }
}
