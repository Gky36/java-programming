package day28_loops;

public class JavaCityCases_01
{
    public static void main(String[] args)
    {
      // Each day Covid CASE increase 200 and only sunday 500
      // What is a total number of covid cases
      // Print the report

        int totalCase=0;

        for(int day=1;day<=30;day++)
        {
            if (day%7==0)
            {
                totalCase +=500;
            }
            else
            {
                totalCase +=200;
            }
            System.out.println("Day"+day+" | total case : "+totalCase);
        }
        System.out.println("Total case for a month: " + totalCase);
    }
}
