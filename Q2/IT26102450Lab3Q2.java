import java.util.Scanner;

public class IT26102450Lab3Q2 {

	public static void main ( String[] args){
	
	double monthlySalary ,numberOfOtHours ,OtHourlyRate ,Otamount ,TotalSalary ;
	
	Scanner input = new Scanner (System.in);
	System.out.print("Enter the monthly Salary: ");
	monthlySalary = input.nextDouble();
	
	System.out.print("Enter Number of OT Hours: ");
	numberOfOtHours = input.nextDouble();
	
	System.out.print("Enter OT hourly Rate: ");
	OtHourlyRate = input.nextDouble();
	
	Otamount = numberOfOtHours * OtHourlyRate;
	TotalSalary = monthlySalary + Otamount;
	
	System.out.println();
	System.out.println("the total salary including OT is :"+ TotalSalary);
}
}