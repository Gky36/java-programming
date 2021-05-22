package OfficeHours.Practice_05_18;

public class Earth
{
    public static void main(String[] args)
    {
       AnimalSpecies dogs = new AnimalSpecies();
       dogs.setInfo("dogs",50,10);
       System.out.println(dogs.getName());
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();
        cats.setInfo("cats",100,15);
        System.out.println(cats);


        // we should not reassign to object again
        AnimalSpecies birds = cats;
        cats.setInfo("birds", 200, 20);
        System.out.println(birds);


    }
}
