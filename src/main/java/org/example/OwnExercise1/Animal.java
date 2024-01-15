package org.example.OwnExercise1;

public class Animal {
    protected String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void whoIam()
    {
        System.out.println("To override method");
    }
    public void whoIam(boolean bool_x)
    {
        if(bool_x)
        {
            System.out.println("My name is "+name);
        }
    }

}
