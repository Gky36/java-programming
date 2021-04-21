package day16_switch_ternary;

public class FloorSelector_01
{
    public static void main(String[] args)
    {
      int floorNum=1;
      if(floorNum==1)
      {
          System.out.println(" Floor 1 selected.Companies: Verizon, Starbucks");
      }
      else if (floorNum>1)
      {
          System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
      }
      else if (floorNum>2)
      {
          System.out.println("Floor 3 selected. Companies: Lfte, Bofa, Steak House");
      }
      else
      {
          System.out.println("Invalid Floor"+floorNum);
      }

        System.out.println(" ====== SWITCH STATEMENT VERSION======");

      floorNum= 1;

      switch(floorNum)
      {
          case 1:           // SAME AS if(floorNum==1)
              System.out.println("Floor 1 selected.Companies: Verizon, Starbucks");
              break;        // EXIT SWITCH
          case 2:
              System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
              break;
          case 3:
              System.out.println("Floor 3 selected. Companies: Lfte, Bofa, Steak House");
              break;
          default:
              System.out.println("Invalid Floor"+floorNum);

      }
    }
}

/*
    SWITCH STATEMENT:

    switch(VARIABLE_NAME)
    {
        case1:
        //code to run and than
        break => each case has to break at the end
        default => instead of else we use default
    }

    SWITCH STATEMENT ONLY USE == we can not use other > < => ...

    BENEFITS:
        =>more readable code
        =>easier to maintain
        =>might be faster than if else if statement, since it jumps to matching case right away.
 */