package org.example.OwnExercise1;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(String color,double side1,double side2,double side3)
    {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        double s = (side1+side2+side3)/2f;
        return Math.pow((s*(s-side1)*(s-side2)*(s-side3)),(1/2f));
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }
}
