package com.company.homework2;

public class Circle implements Shape {
    private int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquere() {
        return radius * radius * Math.PI;
    }
}
