package pkg;
import java.lang.Math;
import java.util.Scanner;

public class tuitioncalc
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double tuition;
    double percent;
    double totalcost = 0;
    
    System.out.println("What is the tuition cost?");
		tuition=input.nextDouble();
    for (int num = 0; num < 4; num++) //for all 4 years, compound the percent to the tuition cost 
    {
		System.out.println("What is the percent increase this year in decimal form?");
		percent = input.nextDouble() ;
		totalcost += tuition * (1+percent);
	}
    System.out.printf("Your total tuition cost for 4 years is $%.2f", totalcost);
  }
}