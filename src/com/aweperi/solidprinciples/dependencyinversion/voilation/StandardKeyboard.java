package com.aweperi.solidprinciples.dependencyinversion.voilation;

public class StandardKeyboard {
    private boolean capsOn = false;

    public void turnCapsOn() {
        capsOn = true;
    }

    public void turnCapsOff() {
        capsOn = false;
    }
}
