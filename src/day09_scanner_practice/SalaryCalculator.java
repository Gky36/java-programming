package day09_scanner_practice;

public class SalaryCalculator
{
    public static void main(String[]args)
    {
        System.out.println("Enter Hourly payment:");
        double hourlyRate=45.50;
        double weeklyPay=hourlyRate*40;
        double monthlyPay=weeklyPay*52/12;
        double annualPay=monthlyPay*12;

        System.out.println("Weekly Payment: $"+weeklyPay);
        System.out.println("Monthly Payment: $"+monthlyPay);
        System.out.println("Annual Payment: $"+annualPay);
    }
}
