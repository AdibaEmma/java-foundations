package com.aweperi.inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textbox = new TextBox();
        control.toggle();
        System.out.println(control.isEnabled());
        textbox.toggle();
        System.out.println(textbox.isEnabled());
        textbox.setText("Hi");


        Point point1 = new Point(1,2);
        Point point2 = new Point(1,3);
        System.out.println(point1.equals(point2));
        System.out.println(point1 == point2);
    }
}
