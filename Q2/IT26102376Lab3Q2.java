import java.util.Scanner;

public class IT26102376Lab3Q2 
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("Enter Monthly Salary:");
		double monthlysalary = sc.nextDouble();
		
		System.out.print ("Enter OT Hours:");
		double otHours = sc.nextDouble();
		
		System.out.print ("Enter OT Rate:");
		double otRate = sc.nextDouble();
		
		double totSalary = monthlysalary + (otHours * otRate);
		System.out.print ("Total Salary:" + totSalary);
	}
}