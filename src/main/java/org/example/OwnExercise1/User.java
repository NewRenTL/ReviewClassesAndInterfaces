package org.example.OwnExercise1;

public class User {
    private String name;
    private int age;
    private String lastname;

    public User(String name,String lastname,int age)
    {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    public User()
    {
        this.name = "Anonymous";
        this.lastname = "Anonymous lastname";
        this.age = -1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
