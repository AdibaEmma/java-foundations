package com.aweperi.inheritance;

public class Main {
    public static void main(String[] args) {
        var textbox = new TextBox();
        textbox.toggle();
        System.out.println(textbox.isEnabled());
        textbox.setText("Hi");

        var buddy = new Dog();
        buddy.eat();

        var happy = new Cat();
        happy.meow();
        happy.eat();

        Point point1 = new Point(1,2);
        Point point2 = new Point(1,3);
        System.out.println(point1.equals(point2));
        System.out.println(point1 == point2);
    }
}
