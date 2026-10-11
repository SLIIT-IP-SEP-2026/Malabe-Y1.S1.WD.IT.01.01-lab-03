import java.util.Scanner;

public class IT26102527Lab3Q2{
	
	public static void main(String[] args){
		
		double monthlySalary, numberOfHours, hourlyRate, totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of hours: ");
		numberOfHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		hourlyRate = input.nextDouble();
		
		totalSalary = monthlySalary + (numberOfHours * hourlyRate);
		
		System.out.println();
		System.out.println("The total salary including OT is: " + totalSalary );
		
	}
}
		
	
