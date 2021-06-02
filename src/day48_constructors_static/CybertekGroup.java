package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroup
{
    public static void main(String[] args)
    {
        // dependency injection
        Group group1 = new Group("Cyberbugs");

        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Mustafa");
        group1.addMember("Tatiana");
        group1.addMember("Mindy");
        group1.addMember("Chrissy");
        group1.addMember("Ogi");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCuts");
        group2.setMembers(Arrays.asList("Stephen","Wakshum","Bulent","Akrem","Andrea","Andrei"));

        //print all members. not toString()
        System.out.println("group2.getMembers() = " + group2.getMembers());
        //use if statement to check if Akrem is in group2
        if (group2.getMembers().contains("Akrem"))
        {
            System.out.println("Akrem is a member of group2");
        }
        else
        {
            System.out.println("Akrem is not in group2");
        }

        //remove some members from group1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1.toString());


    }
}
