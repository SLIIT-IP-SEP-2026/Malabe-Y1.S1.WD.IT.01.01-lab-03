import  java.util.Scanner;
public class IT26102475Lab3Q2{
	public static void main (String[] args ) {
		
		
		//Declare the variables
			double OTHours,OThourlyRate,monthlySalary,totalSalary,OTAmount;
			
        //create a scanner object to read input
		Scanner input = new Scanner(System.in);
		
//prompt the user to enter the monthly Salary) 
		System.out.print("enter the monthly Salary:  ");
		monthlySalary = input.nextDouble();
		
//prompt the user to enter the number of OT Hs)
		System.out.print("Enter the number of OT hours worked:  ");
		OTHours = input.nextDouble();
		
//prompt the user to enter the hourly rate for OT
		System.out.print (" Enter the OT hourly rate: ");
		OThourlyRate = input.nextDouble();
		
// Calculate the OT amount to be paid
	OTAmount = (OTHours * OThourlyRate);
	
	
// Calculate the totalSalary
	totalSalary = (monthlySalary + OTAmount);

//Display the total salary
	System.out.println();
	System.out.print("Total Salary Amount :" + totalSalary);
	}
}
	

		
		
		
		
		