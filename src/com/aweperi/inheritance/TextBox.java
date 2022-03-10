package com.aweperi.inheritance;

import java.sql.SQLOutput;

public class TextBox extends UIControl {

    public String text;

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        if(!isEnabled()) {
            throw new IllegalStateException("Cannot set text. Please enable field");
        }

        this.text = text;
    }

    public void clear() {
        this.text = "";
    }

    @Override
    public String toString() {
        return  text;
    }
}
