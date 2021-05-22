package day46_encapsulation;

public class CheckingAccount
{
    private double balance;
    private long accountNumber;
    private String accountHolderName;
    private String accountType ="checking";

    public void setBalance(double balance)
    {
        this.balance =balance;
    }
    public double getBalance()
    {
        return balance;
    }

    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public long getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "CheckingAccount\t" +
                "balance =" + balance +
                ", accountNumber = " + accountNumber +
                ", accountHolderName = '" + accountHolderName + '\'' +
                ", accountType = '" + accountType + '\''
                ;
    }
}
