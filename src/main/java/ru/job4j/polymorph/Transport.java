package ru.job4j.polymorph;

public interface Transport {
    void drive();

    void passengers(int quantity);

    int price(int fuel);

}
