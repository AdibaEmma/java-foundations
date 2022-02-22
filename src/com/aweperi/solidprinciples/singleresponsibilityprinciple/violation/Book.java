package com.aweperi.solidprinciples.singleresponsibilityprinciple.violation;

public class Book {
    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    // methods that directly relate to the book properties
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    // method violates srp because the book class should focus on only texts manipulations
    // and not on printing texts
    void printTextToConsole(){
        System.out.println(name + " is published by " + author + ", and contains " + text.length() + " characters");
    }
}
