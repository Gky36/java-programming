package day32_arrays_split;

public class CountUsingSplit_05
{
    public static void main(String[] args)
    {
        String cats="bengal cat tabby cat persian cat no cat here some other cat type ";
        String catsArray[]= cats.split(" ");
        System.out.println("number of 'cat' ="+(catsArray.length-1));
        int count=0;

       for (int i=0; i<catsArray.length; i++)
       {
           if (catsArray[i].equalsIgnoreCase("cat"))
           {
               count++;
           }
       }
        System.out.println(count);

    }
}
