import java.util.Scanner;

public class IT26102447Lab3Q2 {
	
	public static void main(String[] args) {
		
		double theNumberOfOThours, OThourlyRate, monthlySalary, oTamount, totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		theNumberOfOThours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		OThourlyRate = input.nextDouble();
		
		oTamount = theNumberOfOThours * OThourlyRate;
		totalSalary = monthlySalary + oTamount;
		
		System.out.println("Total salary: " +totalSalary);
		
	}
}