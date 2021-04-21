package day24_loops;

public class WhileLoopApples_01 {
    public static void main(String[] args) throws InterruptedException {
        int apples = 1;

        while (apples <= 10)
        {
            System.out.println("Eating an apple");
            apples++;
        }
        System.out.println("No more apples");


        System.out.println("Worlds smallest cat");


        int seconds = 0;
        while (seconds <= 117)
        {
            System.out.println("Watching \uD83D\uDC08 at second:" + seconds);
            seconds++;
        }

        System.out.println("Finished watching the \uD83D\uDC08 video");
        System.out.println("Lets start another one!");


    }
}
