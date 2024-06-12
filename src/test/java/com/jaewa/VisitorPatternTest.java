package com.jaewa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VisitorPatternTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(3);
        AreaCalculator calculator = new AreaCalculator();
        circle.accept(calculator);
        assertEquals(Math.PI * 9, calculator.getArea(), 0.0001);
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        AreaCalculator calculator = new AreaCalculator();
        rectangle.accept(calculator);
        assertEquals(20, calculator.getArea(), 0.0001);
    }
}

