import java.util.Scanner;

public class IT26102434Lab3Q2 {

	public static void main (String[] args) {

		double monthlySalary, OThours, OThourlyRate, OTAmount, totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print ("Enter the number of OT hours: ");
		OThours = input.nextDouble();
		
		System.out.print ("Enter the OT hourly rate: ");
		OThourlyRate = input.nextDouble();
		
		OTAmount = OThours * OThourlyRate;
		totalSalary = monthlySalary + OTAmount;
		
		System.out.println();
		System.out.println("The total salary including OT is: " + totalSalary);
	}
}