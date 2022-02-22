package com.aweperi.solidprinciples.singleresponsibilityprinciple.violation;

public class Book {
    String name;
    String authorName;
    int year;
    int price;
    String isbn;

    public Book(String name, String authorName, int year, int price, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }
}
