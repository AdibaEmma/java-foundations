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
    }
}
