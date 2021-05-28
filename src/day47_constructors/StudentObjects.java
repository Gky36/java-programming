package day47_constructors;

public class StudentObjects
{
    public static void main(String[] args)
    {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Gokay");
        Student st4 = new Student("Alihan");

        Student st5 = new Student(33);
        Student st6 = new Student("Nicole",28);
    }
}
