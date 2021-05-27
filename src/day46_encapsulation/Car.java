package day46_encapsulation;

public class Car
{
    //encapsulated/ hidden instance variables
    private String model;
    private int year;
    private int mileage;

    //setter method for model
   public void setModel(String carModel)
   {
       model = carModel;
   }

   //getter method for model
   public String getModel()
   {
       return model;
   }
   public void setYear(int year)
   {
       this.year = year;
   }

    public int getYear() {
        return year;
    }

    public void setMileage(int mileage)
    {
       this.mileage = mileage;
    }

    public int getMileage()
    {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car" +
                "model ='" + model + '\'' +
                ",year = " + year +
                ",mileage = " + mileage
                ;
    }
}
/*
ENCAPSULATION -> is a process of hiding the data by

1) making instance variables private and
2) providing public getter/setter methods to access instance variables.

Benefits:
    - protect instance variables from invalid values.
        - we can use conditions in setter methods to verify if data that is requested to be
            assigned is valid
        - customize getter method to return data in certain format
        - overall benefits is to protect your instance variables from unauthorized values/acsee
   System.out.println(car1.toString());
   System.out.println(car1);

  toString() is a special method that exists in each and every object.
  It is normally used to DESCRIBE the object with assigned data.
  It is converts each instance variable values into a String and returns as 1 string value.

 Below 2 statements are both calling toString() method.
 When you print object reference variable, it will call toString() method automatically
    System.out.println(car1.toString());
    System.out.println(car1);

    this.type = yype <==== this keyword means THIS INSTANCE OF THE CLASS.
    this.type ->> means type variable with is INSTANCE variable.

 We need this, keyword in our methods when method parameter variable has same name as instance variable
 type; -> param variable type.
 if we do not use this.type - java will not assign data to instance variable.


 */