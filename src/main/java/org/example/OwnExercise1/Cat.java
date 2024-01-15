package org.example.OwnExercise1;

public class Cat extends Animal {

    public Cat(String name)
    {
        super(name);
    }

    public void meow()
    {
        System.out.println("The Cat meows");
    }

    @Override
    public void whoIam()
    {
        System.out.println("I'm a cat");
    }

}
