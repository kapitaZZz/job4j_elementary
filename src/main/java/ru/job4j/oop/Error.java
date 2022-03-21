package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error is - " + active);
        System.out.println("Status is - " + status);
        System.out.println("Message is - " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 404, "Page not found");
        Error error2 = new Error(false, 200, "OK");
        Error error3 = new Error(true, 500, "Something goes wrong");

        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
