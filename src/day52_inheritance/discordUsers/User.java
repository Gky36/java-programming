package day52_inheritance.discordUsers;

public class User
{

    private String role;
    private String name;
    private int id;

    public User()
    {
        System.out.println("User class constructor");
    }

    public User(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}

/*
SUPER. -> is used to call/access parent class methods and variables
SUPER() -> is used to call parent class constructor

=================================================

ENCAPSULATION + INHERITANCE
---------------------------

ENCAPSULATION -> is a process of hiding data/variable by making instance variables private and providing public getters and setters

If a super class has encapsulated variables, then how sub class can use them?

Even though private variables are not inherited, sub classes can use parent class getters and setters or parent class constructor to assign/read value from private variables.
==========================================

CONSTRUCTORS AND INHERITANCE

When we use inheritance, and create object of child class.
Java will first create object of parent class
and then create object of child class.

When we create object of sub class, java will first run the constructor of super class then run the constructor of sub class.

public class B extends A {}

B b = new B();
  -> create object of A
  -> then create object of B

A class constructor runs first
Then B class constructor runs next
 */