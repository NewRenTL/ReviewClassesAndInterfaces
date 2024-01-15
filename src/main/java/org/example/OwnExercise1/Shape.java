package org.example.OwnExercise1;

public abstract class Shape {
    protected String color;

    public Shape(String color)
    {
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void showInformation()
    {
        System.out.println("Color : "+color);
    }
}
