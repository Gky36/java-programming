package day27_loops;

public class ReadStringPortion_02
{
    public static void main(String[] args)
    {

        String list = "cat,car,cat,red_car,java,selenium";

        for (int i = 0; i < list.length() - 2; i++)
        {
            System.out.println(list.substring(i, i + 3));
            //String part=list.substring(i, i + 3)
            if (list.substring(i, i + 3).equals("car")||list.substring(i, i + 3).equals("cat"))
            {
                System.out.println(list.substring(i, i + 3));
            }
            i++;
        }

        for (int i = 0; i < list.length() - 2; i++)
        {
            System.out.println(list.substring(i, i + 3));
            // asadaki gibi string part yaparsak cok daha iyi olur yukaridakinden
            String part=list.substring(i, i + 3);
            if (part.equals("car")||part.equals("cat"))
            {
                System.out.println(part);
            }
            i++;
        }
        //ayni seyleri tekrar tekrar yazmamak icin loop kullaniyoruz.
        // yukardaki ex gordugumuz gibi her 3 characteri aliyor ve yazdiriyor.
        // word.length()-2 yapmamizin sebebi outbound son 3 combination
    }
}