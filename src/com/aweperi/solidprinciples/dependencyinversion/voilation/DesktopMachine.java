package com.aweperi.solidprinciples.dependencyinversion.voilation;

public class DesktopMachine {
    private StandardKeyboard keyboard;
    private LCDMonitor monitor;
    private boolean powerOn = true;

    public DesktopMachine(StandardKeyboard keyboard, LCDMonitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}

// Desktop machine class  is tightly coupled to StandardKeyboard class & LCDMonitor Class
//This means that the class has two more reasons to change and will have to recompile each time any of the class change