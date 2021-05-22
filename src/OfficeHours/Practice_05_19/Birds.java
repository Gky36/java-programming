package OfficeHours.Practice_05_19;

public class Birds
{
    //encapsulation
    // protect to data, proving the in direct access
    // we can not access without class  if we use private
    private String species;
    private boolean canFly;
    private double beakLength;
    private String planet = "Earth";

    public  String getPlanet(){
        return this.getPlanet();
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species==null || species.isEmpty())
        {
            return;
        }
        this.species = species;
    }

    public boolean CanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        if (beakLength>0)
        {
            this.beakLength = beakLength;
        }
        else {
            System.out.println("Invalid length");
        }
    }
}
/*
 this is a reference whatever object use
 let assume we have birth object
 Birds bird = new Birds();
 bird.setSpecies()

 We dont want anyone to access data, so there are some other ways and this is one of them.

 */