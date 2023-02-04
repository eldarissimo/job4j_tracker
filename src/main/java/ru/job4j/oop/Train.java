package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " подключается к электротяге и начинает движение.");
    }

    @Override
    public void endsMove() {
        System.out.println(getClass().getSimpleName() + " останавливается и отключается от элетросети.");
    }
}
