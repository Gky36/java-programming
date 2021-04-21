package SaimExamples.SwitchExampl;

public class Loan
{
    public static void main(String[] args)
    {
      double yearlySalary=60_000;
      int creditScore=500;
      String loan=(yearlySalary>=60000 && creditScore>650)? "Loan Approved":"Loan Denied";
        System.out.println("Eligible to get A loan = " + loan);
    }
}
/*

[Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"
 */