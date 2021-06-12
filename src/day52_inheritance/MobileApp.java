package day52_inheritance;

public class MobileApp
{
   private String name;
   private double version;

    protected boolean download() {
        System.out.println("App: " + name +" version: " + version +" is downloaded");
        return true;
    }

    public void useTheApp(int minutes) {
        System.out.println("Using " + name + " app for " + minutes + " minutes");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }
}
/*
4 most important rules:
    1) inherited method with same signature(same method name and same signature)
    2) Access modifier must same or more visible:
        Public> Public
        Protected >Protected
        Default> Default/ Protected/ Public
        Private> is not inherited, so it is not going to be overriding
    3) Return type must be same or sometimes sub class version. if there is a sub class
    4)

 Public -> visible/accessible to every class. In same package or another
        -> public variables and methods are always inherited to subclasses

 protected -> visible/ accessible to every class in SAME package and to Sub_CLASSES in other packages
           -> protected variables and methods are always inherited to sub classes
 Default -> visible/accessible in SAME package only. Not visible or accessible to ANY other CLASS in different package.
        -> default variables and methods are inherited ONLY when sub class and super class aer IN THE SAME package.
        Not inherited
 private-> visible/accessible in SAME CLASS ONLY. and nowhere else.
        > private variables and methods are NOT inherited from super class to sub class


 */