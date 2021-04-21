package day31_arrays;

public class CharArray_01
{
    public static void main(String[] args)
    {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        // Print to letters
        for(char each :letters)
        {
            System.out.print(each);
        }


        //CONVERT CHAR ARRAY into STRING:
        String str= new String(letters);
        System.out.println("\n Sentence :"+str);


        // CONVERT STRING TO CHAR ARRAY
        String item="wooden spoon";
        char[] itemArray=item.toCharArray();
        System.out.println(itemArray);
        System.out.println("str array.length "+str.length());
        System.out.println("item.length = "+itemArray.length);

        String[] fruits= {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr="";
        for (String each : fruits)
        {
            System.out.print(each+" - ");
            fruitStr += each +"-";
        }
        System.out.print("\nfruitStr = " + fruitStr);
        System.out.println();


        String [] languages={"Java", "Python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|", languages));
        System.out.println(String.join("###", languages));

        String joinedLanguages= String.join("<>",languages);
        System.out.println("joinedLanguages = " + joinedLanguages);

    }
}
/*
    When we have char array, we can create a String out of it.
    it will automatically join each letter into a single string

    Convert char ARRAY into string:
    just a create a new String with char array in constructor

    Convert STRING  into CHAR ARRAY:

 */
