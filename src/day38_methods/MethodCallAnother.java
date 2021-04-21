package day38_methods;

public class MethodCallAnother
{
    public static void main(String[] args)
    {
      printNum(100);
      start();
      continues();
      end();
    }

    public static void printNum(int num)
    {
        System.out.println(num);
        num--;
        if (num>=0)
        {
            System.out.println(num);
        }
    }

    public static void start()
    {
        System.out.println("start");
        continues();

    }
    public static void continues()
    {
        System.out.println("continue");
        end();
    }
    public static void end()
    {
        System.out.println("end");
    }
}
