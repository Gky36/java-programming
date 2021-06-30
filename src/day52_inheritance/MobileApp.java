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
	1) inherited method with same signature (same method name and same parameter)
	See screenshots for full list
======================================

What is inherited from Super class to Sub class?

It depends on access modifier. Which sets the visibility and access to the variable or method.

There are 4 types of Access modifiers:

public -> visible/accessible to every class. In same package or another.
	   -> public variables and methods are always inherited to subclasses
protected -> visible/accessible to every class in SAME package and to SUB_CLASSES in other packages.
		  -> protected variables and methods are always inherited to sub classes

default -> visible/accessible in SAME package only. Not visible or accessible to ANY other CLASS in different package.
		-> default variables and methods are inherited ONLY when sub class and super class are IN THE SAME package. Not inherited to sub classes in different packages

private -> visible/accessible in SAME CLASS ONLY. and nowhere else.
		-> private variables and methods are NOT inherited from super class to sub class


 */