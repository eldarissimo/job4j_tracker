package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dict = new DummyDic();
        System.out.println(dict.engToRus("Holly cow!"));
        DummyDic dict2 = new DummyDic();
        System.out.println(dict2.engToRus("Yep, yes, aha"));
    }
}

