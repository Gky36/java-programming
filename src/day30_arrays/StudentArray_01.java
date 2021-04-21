package day30_arrays;

public class StudentArray_01
{
    public static void main(String[] args)
    {
        String [] student1 = {"1234", "Gokay","Yazar","Batch21","9174298"};
        System.out.println("Student Id: "+student1[0]);
        System.out.println("Name: "+student1[1]);
        System.out.println("LastName: "+student1[2]);
        System.out.println("Batch No: "+student1[3]);
        System.out.println("Phone Number: "+student1[4]);
        System.out.println("student data length: "+student1.length);


        String[] student2= new String[5];
        student2[0]="1231";
        student2[1]="Mike";
        student2[2]="Bloomberg";
        student2[3]="Batch22";
        student2[4]="917-4293221";

        if (student1.length==5)
        {
            System.out.println("PASS: data array has correct length");
        }
        else
        {
            System.out.println("FAIL: data array has incorrect length");
        }

        if (student1.length==student2.length)
        {
            System.out.println("PASS: data arrays length match");
        }
        else
        {
            System.out.println("FAIL: data arrays length mismatch");
        }

        // first name of Student1 and lastName make UPPERCASE
        System.out.println((student1[1]+" "+student1[2]).toUpperCase());

        //read mobile from array and store into variable

        String mobileNum=student1[4];
        System.out.println();

    }
}
