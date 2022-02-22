package com.aweperi.solidprinciples.singleresponsibilityprinciple.solution;

public class Book extends BookPrinter{
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

    @Override
    void printTextToConsole(String text) {
        super.printTextToConsole(text);
    }

    @Override
    void printTextToAnotherMedium(String text) {
        super.printTextToAnotherMedium(text);
    }
}
