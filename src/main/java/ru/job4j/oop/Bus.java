package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " набирает пассажиров и начинает движение.");
    }

    @Override
    public void endsMove() {
        System.out.println(getClass().getSimpleName() + " останавливается и высаживает пассажиров.");
    }
}
