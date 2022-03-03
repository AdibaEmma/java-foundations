package com.aweperi.solidprinciples.dependencyinversion.solution;

public class LCDMonitor  implements Monitor{
    private boolean display = false;
    private int brightness = 50;

    @Override
    public int increaseBrightness(int value) {
        return 0;
    }

    @Override
    public int decreaseBrightness(int value) {
        return 0;
    }

    @Override
    public void turnDisplayOn() {
        this.display = true;
    }

}
