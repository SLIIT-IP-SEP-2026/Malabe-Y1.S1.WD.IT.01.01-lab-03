// Q2

import java.util.Scanner;

public class IT26300584Lab3Q2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary : Rs. ");
		double monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours : Rs. ");
		double OThours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate : Rs. ");
		double OTrate = input.nextDouble();
		
		double totSalary = monthlySalary + (OThours*OTrate);
		
		System.out.print("The total salary including OT is : Rs. " + totSalary);
	}
}
