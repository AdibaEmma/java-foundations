package com.aweperi.solidprinciples.dependencyinversion.solution;

public class LEDMonitor implements Monitor{
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

    }
}
