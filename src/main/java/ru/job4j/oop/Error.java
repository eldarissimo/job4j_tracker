package ru.job4j.oop;

public class Error {

    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 200, "It is a good error");
        error.printInfo();
        Error error1 = new Error(false, 404, "It is a bad error");
        error1.printInfo();
        Error errorDefault = new Error();
        errorDefault.printInfo();
    }
}
