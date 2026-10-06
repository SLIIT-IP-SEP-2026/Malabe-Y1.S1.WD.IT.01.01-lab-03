import java.util.Scanner;

public class IT26102529Lab3Q2
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		double MonthlySalary,OtHours,OtHourlyRate,OtAmount,TotalSalary;
		
		System.out.println("Enter the monthly salary; ");
		MonthlySalary=input.nextDouble();
		
		System.out.println("Enter the no of ot hours; ");
		OtHours =input.nextDouble();
		
		System.out.println("Enter the ot hourly rate; ");
		OtHourlyRate =input.nextDouble();
		
		OtAmount=OtHours*OtHourlyRate;
		
		TotalSalary=MonthlySalary+OtAmount;
		
		System.out.println("The total amount is: "+TotalSalary);
		
		
	}
}