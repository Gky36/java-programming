package SaimExamples.Loop_Practice;

public class TextBook
{
    public static void main(String[] args)
    {
        /*
        Java textbook By Murodil. Chapter 1 datatypes and variables.
         Chapter 2 conditional statements. chapter 3 String manipulation.
         Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors.
         Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections.
          Chapter 14 Learn more. 14 Chapters -> value of the book: 140
         */


        String book= "Java textbook By Murodil. Chapter 1 datatypes and variables.\n" +
                "         Chapter 2 conditional statements. chapter 3 String manipulation.\n" +
                "         Chapter 4 Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static. Chapter 9 Constructors.\n" +
                "         Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections.\n" +
                "          Chapter 14 Learn more.";

        int count=0;
        book=book.toLowerCase();

        while(book.contains("chapter"))
        {
            book=book.replaceFirst("chapter","");
            count++;
        }
        System.out.println("chapter = " + count);
        System.out.println(count*10+"$");

    }
}
