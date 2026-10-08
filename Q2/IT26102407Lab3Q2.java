import java.util.Scanner;
public class IT26102407Lab3Q2 {
	
	public static void main(String[]args){
		
		//Create scanner 
		Scanner sc = new Scanner(System.in);
		
		//Creating variables
		double MonthlySalary , OThours , OTHourlyRate , OTAmount , TotalSalary;
		
		//Getting salary
		System.out.print("Enter the monthly salary: ");
		MonthlySalary = sc.nextDouble();
		
		//Getting OT hours
		System.out.print("Enter the number of OT hours: ");
		OThours = sc.nextDouble();
		
		//Getting OT hourly rate
		System.out.print("Enter the OT hourly rate: ");
		OTHourlyRate = sc.nextDouble();
		
		//Calculating the OT amount
		OTAmount = OThours*OTHourlyRate;
		
		//Calculating the total salary
		TotalSalary = MonthlySalary + OTAmount;
		
		//This line is use to have a space between inputs and output
		System.out.println("");
		
		//print the total slary
		System.out.print("The total salary including OT is: "+TotalSalary);
		
	}
	
}