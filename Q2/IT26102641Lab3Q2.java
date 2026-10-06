import java.util.Scanner;

public class IT26102641Lab3Q2{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double monthlySalary,otHours,otRate;
	double otAmount,totalSalary;
	
	System.out.print("Enter the monthly salary: ");
	monthlySalary=input.nextDouble();
	
	System.out.print("Enter the number of OT Hours: ");
	otHours=input.nextDouble();
	
	System.out.print("Enter the OT hourly rate: ");
	otRate=input.nextDouble();
	
	otAmount=otHours*otRate;
	totalSalary=monthlySalary + otAmount;
	
	System.out.println("");
	System.out.println("The total salary including OT is: " + totalSalary);
	}
}