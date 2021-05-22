package Practice;

public class NestedLoop {
    public static void main(String[] args) {
//        for (int outer = 1; outer <= 5; outer++) {
//            for (int inner = 1; inner <= 10; inner++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//
//        // Mupliplication table
//
//        for (int i = 1; i < 10; i++) {
//            for (int n = 1; n <= 10; n++) {
//                int result = i * n;
//                System.out.print(i + "*" + n + " = " + result + "\t\t");
//            }
//            System.out.println();
//        }
        // 2 HOURS 10 MINUTES AND 50 SECOND

        for (int hours=0; hours<=5; hours++)
        {
            if(hours>2) break;
            for (int minutes=0; minutes<=59; minutes++)
            {
                if (hours==2 && minutes>10) break;
                for (int second=0; second<=59; second++)
                {
                    if (hours==2 && minutes==10 && second==50) break;
                     System.out.println(hours + ":" + minutes + ":" + second);
                }
            }
        }
    }

//        String word ="java";
//        // first - j
//        // second- j
//        // count - 1
//        for (int i=0; i<word.length(); i++)
//        {
//           int count=0;
//           char eachLetter= word.charAt(i);
//
//           for (int n=0; n<word.length(); n++)
//            {
//                char eachLetter2= word.charAt(n);
//                if (eachLetter == eachLetter2)
//                {
//                    count++;
//                }
//            }
//            System.out.println(eachLetter+ " "+count);
//        }

//        String [][] fancyColors = {{"Red","Blue","Green"},{"Cyan","Magenta","Turguise"}};
//
//        for (int i=0; i<2; i++)
//        {
//            for (int j=0; j<3; j++)
//            {
//                System.out.println(fancyColors[i][j]);
//            }
//        }

    }

