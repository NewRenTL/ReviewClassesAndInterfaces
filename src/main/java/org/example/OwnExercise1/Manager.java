package org.example.OwnExercise1;

public class Manager implements Employee{

    private String employeeName;
    private double salary;
    private double bono;
    public Manager(String name,double salary,double bono)
    {
        this.employeeName = name;
        this.salary = salary;
        this.bono = bono;
    }
    @Override
    public double calculateSalary() {
        return salary + bono;
    }

    @Override
    public String getInformation() {
        return "I'm a manager within the "+business+" company and my name is "+employeeName+" and my Monthly salary is "+salary +
                " additionally have my salary bonus of "+bono;
    }

}
