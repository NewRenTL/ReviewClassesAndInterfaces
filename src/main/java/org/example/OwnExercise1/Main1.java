package org.example.OwnExercise1;

public class Main1 {

    public static void separatedLines()
    {
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("Diego","Bustamante",20);

        System.out.println("Name:"+user1.getName());
        System.out.println("Lastname:"+user1.getLastname());
        System.out.println("Age:"+user1.getAge());
        System.out.println("Class:"+user1.getClass());
        System.out.println(user1 instanceof User);


        System.out.println("Methods to compare 2 classes or verify if an instance is a specified class");
        separatedLines();

        //How can I compare 2 declared instances by class
        //GetClass()
        if (user1.getClass() == user2.getClass())
        {
            System.out.println(user1.getName()+" and "+user2.getName()+" are the same type of class");
        }

        //How can I verify if a class is specified class
        if(user1 instanceof User)
        {
            System.out.println(user1.getName() + " is User class");
        }
        System.out.println();
        separatedLines();
        System.out.println("Class Inheritance");
        Animal a1 = new Animal("Duck");
        Dog d1 = new Dog("Doggy");
        Cat c1 = new Cat("Michi");
        System.out.println("Parent Class:"+ a1.getClass().getSimpleName());
        System.out.println("First Children Class:"+d1.getClass().getSimpleName());
        d1.whoIam();
        d1.whoIam(true);
        System.out.println("Second Children Class:"+c1.getClass().getSimpleName());
        c1.whoIam(true);
        c1.whoIam();

        System.out.println();
        System.out.println("Class Abstract(This class can't instantiated)");
        separatedLines();
        Circle circle1 = new Circle("Red",12);
        Triangle triangle1 = new Triangle("Blue",5,8,7);
        System.out.println("Class Abstract:"+ Shape.class.getSimpleName());
        System.out.println("First Children Class:"+ circle1.getClass().getSimpleName());
        System.out.println("Perimeter:"+circle1.calculatePerimeter());
        System.out.println("Area:"+circle1.calculateArea());
        System.out.println("Second Children Class:"+triangle1.getClass().getSimpleName());
        System.out.println("Perimeter:"+triangle1.calculatePerimeter());
        System.out.println("Area:"+triangle1.calculateArea());

    }

}
