package com.aweperi.solidprinciples.liskovsubstitution;

public class Engine {
    private Boolean engineOn = false;
    private int acceleration;

    public Engine(Boolean engineOn, int acceleration) {
        this.engineOn = engineOn;
        this.acceleration = acceleration;
    }

    public void on() {
        engineOn = true;
    }

    public Boolean getEngineOn() {
        return engineOn;
    }

    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }
}
