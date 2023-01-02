package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        System.out.println("Заяц попытался съесть колобка");
        hare.tryEat(ball);
        System.out.println("Волк попытался съесть колобка");
        wolf.tryEat(ball);
        System.out.println("Лиса попыталась съесть колобка");
        fox.tryEat(ball);
    }
}
