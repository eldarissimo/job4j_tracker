package ru.job4j.oop;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[] {airplane, train, bus};
        for (Vehicle start : vehicles) {
            start.move();
        }
        for (Vehicle finish : vehicles) {
            finish.endsMove();
        }
    }
}
