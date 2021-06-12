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

Summary:
    -> overriding rules
    -> access modifiers and what is inherited
    -> encapsulation + inheritance
    -> constructors + inheritance
    -> super()

 */