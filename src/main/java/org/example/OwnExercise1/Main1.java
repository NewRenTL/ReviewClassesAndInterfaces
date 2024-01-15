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

    }
}
