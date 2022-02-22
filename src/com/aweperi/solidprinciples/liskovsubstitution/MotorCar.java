package com.aweperi.solidprinciples.liskovsubstitution;

public class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.setAcceleration(1000);
    }
}
