package day57_abstraction_polymorphism.polymorhism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest
{
    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polymorphic, data type and object type are SAME
        a1.makeNoise();

        //Polymorphism - polymorphic way:
        //parent type = new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal animal3 = new Cat();

        //List list = new ArrayList();
        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each: listOfAnimals)
        {
            each.makeNoise();
        }
    }
}
