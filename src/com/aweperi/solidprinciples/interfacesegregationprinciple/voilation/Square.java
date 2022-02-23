package com.aweperi.solidprinciples.interfacesegregationprinciple.voilation;

public class Square implements Shape{
    @Override
    public int area() {
        return 0;
    }

    // this method is not needed by the square class.
    // Hence, it should not be made to implement it
    @Override
    public int volume() {
        return 0;
    }
}
