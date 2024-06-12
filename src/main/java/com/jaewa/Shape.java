package com.jaewa;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
