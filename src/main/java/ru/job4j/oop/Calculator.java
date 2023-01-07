package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        int rslSum = sum(10);
        System.out.println(rslSum);
        Calculator calculator = new Calculator();
        int rslMulti = calculator.multiply(5);
        System.out.println(rslMulti);
        int rslMinus = minus(15);
        System.out.println(rslMinus);
        Calculator calculator1 = new Calculator();
        int rslDiv = calculator1.divide(25);
        System.out.println(rslDiv);
        Calculator calculator2 = new Calculator();
        int rslAll = calculator2.sumAllOperation(10);
        System.out.println(rslAll);
    }
}