import java.util.Scanner;

public class IT26102648Lab3Q2{
	public static void main(String[]args){
		double OTHours,OTHourlyRate,monthlySalary,totalSalary;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		OTHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		OTHourlyRate = input.nextDouble();
		
		totalSalary = monthlySalary + (OTHours*OTHourlyRate);
		
		System.out.println();
		System.out.print("The total salary include OT is: " + totalSalary);
	}
}