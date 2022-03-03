package com.aweperi.solidprinciples.dependencyinversion.solution;

public class Developer {
    public static void main(String[] args) {
        var desktopMachine = new DesktopMachine(new StandardKeyboard(), new LCDMonitor());

        desktopMachine.setUpComponents(new ErgonomicKeyboard(), new LEDMonitor());

    }
}
