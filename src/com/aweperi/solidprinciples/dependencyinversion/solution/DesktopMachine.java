package com.aweperi.solidprinciples.dependencyinversion.solution;

public class DesktopMachine {
    private Keyboard keyboard;
    private Monitor monitor;

    // Constructor injection
    public DesktopMachine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    // Setter injection
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    // Setter injection
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    // method injection
    public void setUpComponents(Keyboard keyboard, Monitor monitor) {
        this.keyboard =
                keyboard;
        this.monitor = monitor;
    }
}
