package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book carlson = new Book("Carlson", 150);
        Book mashaAndBears = new Book("Masha and Bears", 20);
        Book goldenFish = new Book("Golden Fish", 30);
        Book cleanCode = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = carlson;
        books[1] = mashaAndBears;
        books[2] = goldenFish;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book bookShow = books[index];
            System.out.println(bookShow.getName() + " - " + bookShow.getPages());
        }
        System.out.println("Change books");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bookShow = books[index];
            System.out.println(bookShow.getName() + " - " + bookShow.getPages());
        }
        System.out.println("Shown only Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bookShow = books[index];
            if ("Clean code".equals(bookShow.getName())) {
                System.out.println(bookShow.getName() + " - " + bookShow.getPages());
            }
        }
    }
}
