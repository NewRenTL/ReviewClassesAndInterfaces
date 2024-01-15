package org.example.OwnExercise1;

public class Circle extends Shape {
    private double radio;
    private final double PI = 3.14f;
    public Circle(String color,double radio)
    {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return PI*radio*radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radio*PI;
    }
}
