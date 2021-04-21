package day05_primitives_concatenation;

public class JobInfo
{
    public static void main(String[] args)
    {
        String title = "Java SDET";
        String company = "Google";
        String jobDescription ="Java Expert";
        double salary = 130.340;
        byte yearsExp =10;
        boolean hasBenefits = true;

       //System.out.println("Title:"+title+"\nCompany:"+company+"\nJobDescription:"+jobDescription+"\nSalary: $"+salary+"\nYearsExperience:"+yearsExp+"\nHasBenefits:"+hasBenefits);

        System.out.println("Title:\t\t\t"+title);
        System.out.println("Company:\t\t"+company);
        System.out.println("Job Description:"+jobDescription);
        System.out.println("Salary:\t\t\t$"+salary);
        System.out.println("Years of Experince:\t"+yearsExp);
        System.out.println("Has Benefits:\t"+hasBenefits);

    }
}
