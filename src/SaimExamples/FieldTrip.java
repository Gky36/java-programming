package SaimExamples;

import java.util.Scanner;

public class FieldTrip
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Grade:");
       int grade=scan.nextInt();
       String location="New York";
       int numberOfEachGroups=1;
       String teacherInCharge="Murodil";

       switch (grade)
       {
           case 1:
            location="Apple orchard";
            numberOfEachGroups=3;
            teacherInCharge="Ms. Smith";
               break;
           case 2:
               location="Zoo";
               numberOfEachGroups=7;
               teacherInCharge="Mr. Lee";
               break;
           case 3:
               location="Aquarium";
               numberOfEachGroups=5;
               teacherInCharge="Ms. Wilson";
               break;
           case 4:
               location="Movie theater";
               numberOfEachGroups=2;
               teacherInCharge="Ms. Reyes";
               break;
           case 5:
               location="Museum";
               numberOfEachGroups=5;
               teacherInCharge="Ms. Lela ";
               break;
           case 6:
               location="Six Flags";
               numberOfEachGroups=8;
               teacherInCharge="Mr. Watt ";
               break;
           default:
               System.out.println("Invalid Grade");
       }
        System.out.println("grade = " + grade);
        System.out.println("Location: "+location+"\nNumber Of Each Group: "+numberOfEachGroups+"\nTeacher in Charge: "+teacherInCharge);
    }
}
