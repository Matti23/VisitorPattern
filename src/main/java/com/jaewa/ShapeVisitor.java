package com.jaewa;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

