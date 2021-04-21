package day24_loops;

public class WhileLoopReverse_02
{
    public static void main(String[] args)
    {
        int count=5;

        while (count>=0)
        {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("finish the count");

        int unreadSMS=10;
        System.out.println("I have total "+unreadSMS+" unread sms");

        while (unreadSMS>=0)
        {
            System.out.println("Reading SMS :"+unreadSMS);
            unreadSMS--;
        }
        System.out.println("unreadSMS = " + unreadSMS);
    }
}

/*
    ++ to count forward
    -- to count backwards
 */