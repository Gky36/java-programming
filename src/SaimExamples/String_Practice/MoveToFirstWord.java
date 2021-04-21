package SaimExamples.String_Practice;

public class MoveToFirstWord
{
    public static void main(String[] args)
    {
        String sentence="Java is a fun language";

        System.out.println(sentence.substring(0,4));

        int indexOfIs=sentence.indexOf("is");
        System.out.println(sentence.substring(indexOfIs)+" "+sentence.substring(0,4) );


    }
}

/*
Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:
input: Java is a fun language
output: is a fun language Java
 */