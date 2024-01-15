package org.example.OwnExercise1;

public class Programmer implements Employee{
    private String name;
    private double salary;
    private int extraHours;

    public Programmer(String name,double salary,int extraHours)
    {
        this.name = name;
        this.salary = salary;
        this.extraHours = extraHours;
    }

    @Override
    public double calculateSalary() {
        return salary+(extraHours*20);
    }

    @Override
    public String getInformation() {
        return "I'm a programmer within the "+business+
                "  company and my base salary and my overtime hours generate "+salary;
    }
}
