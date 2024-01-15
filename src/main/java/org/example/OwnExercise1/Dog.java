package org.example.OwnExercise1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void bark()
    {
        System.out.println(name + " barks!");
    }

    @Override
    public void whoIam()
    {
        System.out.println("I'm a dog");
    }
}
