package OfficeHours.Practice_05_12;

public class Bank
{
    public static void main(String[] args)
    {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountHolderName = "James Bond";
        bankAccount1.pin = 1234;
        bankAccount1.balance = 1_000_000;
        bankAccount1.accountNumber = 23243245L;

        System.out.println(bankAccount1.pin);
        // we give the different value to pin, so it will give -1
        System.out.println(bankAccount1.getBalance(2234));
        System.out.println();

        // it will give us null because we made it new object
        // we will not access first object information that we define up
        System.out.println(new BankAccount().accountHolderName);

        bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.accountHolderName);

    }
}
/*
We can not create method inside the method in java.
 */