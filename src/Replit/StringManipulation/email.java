package Replit.StringManipulation;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            System.out.println(lastName+"_"+firstName+"@gmail.com");
        }else{
            System.out.println(email);
        }

    }
}
