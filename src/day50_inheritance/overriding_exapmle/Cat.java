package day50_inheritance.overriding_exapmle;

public class Cat extends Animal
{
    public void jump()
    {
        System.out.println("cat is jumping ");
    }

    @Override
    public void speak()
    {
        System.out.println("Cat is saying Meow...");
    }

}
