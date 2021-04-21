package day13_conditional_statements;

public class IFWithBooleanVariable_04
{
    public static void main(String[]args)
    {
        boolean isHungry=true;
        if(isHungry==true)  //if(isHungry)
        {
            System.out.println("I am hungry I will go get something to eat \nThen code java ");
        }
        else
        {
            System.out.println("I am not hungry, Lets keep coding java");
        }


        double price=130.44;
        boolean isAffordable=price<=200.0; //200 is budget

        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable)
        {
            System.out.println("I can afford it, lets buy!");
        }
        else
        {
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob=true;
        //if it not remoteJob print...
        // otherwise, print"sure...



/* Sort way is  if(!isRemoteJob)
                if(isRemoteJob==false)
                if(isRemoteJob !=true)
 */
        if(isRemoteJob !=true)
        {
            System.out.println("Sorry! I am not interested");
        }
        else
        {
            System.out.println("Sure I am interested, what is interview process");
        }
    }
}
