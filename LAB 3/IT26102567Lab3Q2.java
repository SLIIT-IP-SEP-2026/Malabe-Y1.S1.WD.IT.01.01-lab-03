import java.util.Scanner;

public class IT26102567Lab3Q2 {
	public static void main(String[] args) {
		
	// Declare the variables 
	double otHours, otHourlyRate, otAmount, totalSalary, monthlySalary; 
	
	// Create new scanner object to read input from keyboard
	Scanner input = new Scanner(System.in);
	
	// Input monthly salary 
	System.out.print("Enter monthly salary: ");
	monthlySalary = input.nextDouble();
	
	// Input number of OT Hours 
	System.out.print("Enter number of OT hours: ");
	otHours = input.nextDouble();
	
	// Input the OT hourly rate
	System.out.print("Enter OT hour rate: ");
	otHourlyRate = input.nextDouble();
	
	// Caluate OT amount and Total salary 
	otAmount = otHours * otHourlyRate;
	totalSalary = monthlySalary + otAmount; 
	
	// Display the results
	System.out.println("The total salary for OT is: " + totalSalary);
	
	}
	
}
	