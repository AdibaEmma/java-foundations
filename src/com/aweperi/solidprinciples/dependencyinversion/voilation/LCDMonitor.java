package com.aweperi.solidprinciples.dependencyinversion.voilation;

public class LCDMonitor {
    private boolean display = false;
    private int brightness = 50;

    public void turnDisplayOn() {
        this.display = true;
    }

    public int increaseBrightness(int value) {
        return this.brightness + value;
    }

    public int decreaseBrightness(int value) {
        return this.brightness - value;
    }
}
