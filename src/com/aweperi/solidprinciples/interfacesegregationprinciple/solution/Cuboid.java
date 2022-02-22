package com.aweperi.solidprinciples.interfacesegregationprinciple.solution;

public class Cuboid implements Shape, ThreeDimensionalShape {
    // we can calculate the surface area of the cuboid
    @Override
    public int area() {
        return 0;
    }

    // we can also calculate the volume of the cuboid
    @Override
    public int volume() {
        return 0;
    }
}
