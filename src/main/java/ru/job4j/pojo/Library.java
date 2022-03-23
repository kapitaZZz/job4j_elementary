package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("War and Peace", 930);
        books[1] = new Book("Alphabet", 50);
        books[2] = new Book("Clean Code", 436);
        books[3] = new Book("Effective Java", 457);

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getSheets());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getSheets());
        }
        System.out.println("-----------------------");

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if ("Clean Code".equals(b.getName())) {
                System.out.println(b.getName() + " - " + b.getSheets());
            }
        }
    }
}
