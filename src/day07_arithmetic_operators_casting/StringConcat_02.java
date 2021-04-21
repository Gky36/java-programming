package day07_arithmetic_operators_casting;

public class StringConcat_02
{
    public static void main(String[] args)
    {
      //Java53
     System.out.println("Java"+5+3); // java53
     System.out.println("Java"+(5+3)); //java8
     //Yukarda goruldugu gibi parantez icini her zman daha once hesapliyor, Soldan saga baslamiyor.

     System.out.println(5+3+"Java");//  8java
     System.out.println(5+(3+"java")); //53java
     System.out.println("hello"+1+2+3);//hello123
     System.out.println("hello"+(1+2+3));//hello6

        String str1="Hello";
        String str2="friends";

        System.out.println(str1+str2);
        System.out.println(str1+ " "+str2);

        int num1=7;
        int num2=8;
        System.out.println(num1+num2);//15
        System.out.println(num1+ " "+num2); //7 8

        char char1 ='a';
        char char2 = 'b';
        System.out.println(char1+char2);// 97+98=195 because of char chart
        System.out.println(char1+""+char2); //ab print out because we use String in statement.
    }
}
