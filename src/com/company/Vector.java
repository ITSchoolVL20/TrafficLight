package com.company;

public class Vector {
    float x;
    float y;

    Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void add(Vector other) {
        this.x += other.x;
        this.y += other.y;
    }
}
