import java.util.Scanner;

public class IT26102095Lab3Q2 {
	
	public static void main(String[] args){
		
		int monthlySalary, otRate, otHours, otAmount; 
		double totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextInt();
		
		System.out.print("Enter the Number of OT hours: ");
		otHours = input.nextInt();
		
		System.out.print("Enter the OT hourly rate: ");
		otRate = input.nextInt();
		
		otAmount = otHours * otRate;
		totalSalary = monthlySalary + otAmount;
		
		System.out.println();
		System.out.println("The total salary including OT is: " + totalSalary);
	
	}

}