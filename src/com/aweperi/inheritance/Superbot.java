package com.aweperi.inheritance;

// We want a superbot that can cook, can move, bark and play games
// We realise that becomes impossible except we use multiple inheritance
//But Java does not support multiple inheritance

//Another solution will be to create a new super class that has all the methods we need
//But that will cause code duplication and also create a very complex relationship

//The solution will be to use composition
//it defines a has a relationship
public class Superbot {
    private final Mobility mobility; // has mobility
    private final MakeSound sound; // has sound
    private final Cook cook; // had cooking ability

    public Superbot() {
        this.mobility = new Mobility();
        this.sound = new MakeSound();
        this.cook = new Cook();
    }

    public void move() {
        this.mobility.move();
    }

    public void cook() {
        this.cook.cook();
    }

    public void bark() {
        this.sound.makeSound();
    }

    public void playGames() {
        System.out.println("I love chess!");
    }
}
