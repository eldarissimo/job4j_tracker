package ru.job4j.polymorph;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус начинает свой маршрут");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Вошло пассажиров: " + quantity);
    }

    @Override
    public int price(int fuel) {
        return fuel * 45;
    }
}
