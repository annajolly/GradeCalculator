import java.util.Scanner;

public class gradeCalculator
{
  public static void main(String[] args)
  {
    try
    {
      System.out.println("Name of course:");
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String name = s;
      new GradeGUI(name);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}