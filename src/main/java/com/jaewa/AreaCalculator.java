package com.jaewa;

public class AreaCalculator implements ShapeVisitor {
    private double area;

    @Override
    public void visit(Circle circle) {
        area = Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public void visit(Rectangle rectangle) {
        area = rectangle.getWidth() * rectangle.getHeight();
    }

    public double getArea() {
        return area;
    }
}

