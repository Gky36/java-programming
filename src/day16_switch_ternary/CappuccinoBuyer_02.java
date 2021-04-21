package day16_switch_ternary;

public class CappuccinoBuyer_02
{
    public static void main(String[] args)
    {
        String size="tall";
        double price=0;
        int calories=0;

       switch (size)
       {
           case "tall":
               System.out.println("Tall Cappuccino please");
               price +=3.69;
               calories+=90;
               break;
           case "grande":
               System.out.println("Grande Cappuccino please");
               price+=3.99;
               calories+=120;
               break;
           case "venti":
               System.out.println("Venti Cappuccino please");
               price+=4.29;
               calories+=150;
               break;
           default:
               System.out.println("We dont serve that size of Cappuccino");
       }
        System.out.println("Total Price: $"+price);
        System.out.println("You will consume "+calories);
    }
}
