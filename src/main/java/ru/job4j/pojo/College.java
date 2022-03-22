package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sam");
        student.setSurname("Fisher");
        student.setPatron("Petrovich");
        student.setGroup("CIA");
        student.setIncome(new Date());

        System.out.println("Name-" + student.getName() + "; Surname-" + student.getSurname()
                + "; Patron-" + student.getPatron()
                + "; Group-" + student.getGroup()
                + "; IncomeDate-" + student.getIncome());
    }
}
