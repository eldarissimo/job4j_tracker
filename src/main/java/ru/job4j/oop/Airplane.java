package ru.job4j.oop;

public class Airplane implements  Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " набирает высоту и взлетает.");
    }

    @Override
    public void endsMove() {
        System.out.println(getClass().getSimpleName() + " снижается и приземляется.");
    }
}
