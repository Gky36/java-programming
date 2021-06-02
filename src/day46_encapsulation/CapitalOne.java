package day46_encapsulation;

public class CapitalOne
{
    public static void main(String[] args)
    {
      CheckingAccount myAccount = new CheckingAccount();

      myAccount.setBalance(54900.43);
      myAccount.setAccountNumber(2338242482L);
      myAccount.setAccountHolderName("Gokay ");
      myAccount.setAccountType("Checking");

      System.out.println("Account Holder Name = " + myAccount.getAccountHolderName());
      System.out.println("Account Number = " + myAccount.getAccountNumber());
      System.out.println("Account Balance = " + myAccount.getBalance());
      System.out.println("Account Type = " + myAccount.getAccountType());

      System.out.println(myAccount.toString());
    }
}
// /