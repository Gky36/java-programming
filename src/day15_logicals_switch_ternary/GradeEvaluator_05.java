package day15_logicals_switch_ternary;

public class GradeEvaluator_05
{
    public static void main(String[] args)
    {
      char grade='b';
      if((grade=='A' ||grade=='a')|| (grade=='B' || grade=='b') ||(grade=='C' || grade=='c'))
      {
          System.out.println("Passed with "+grade);
      }
      else if (grade=='D' || grade=='d')
      {
          System.out.println("qualify for retake "+grade);
      }
      else
      {
          System.out.println("invalid grade");
      }
    }
}
