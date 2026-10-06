import java.util.Scanner;
    
public class IT26102417Lab3Q2{
	public static void main (String[]args){
		 
		Scanner input = new Scanner(System.in);
		
		double monthlySalary, otHOurs, hourlyRate,otAmount , total;
		
		System.out.print("Enter the monthlty salary : ");
		monthlySalary = input.nextDouble();
		System.out.print("Enter the number of OT hours :");
		otHOurs = input.nextDouble();
		System.out.print("Enter the OT hourly rate:");
		hourlyRate = input.nextDouble();
		
		otAmount = otHOurs * hourlyRate;
        total = monthlySalary + otAmount;		
		
		System.out.print(" the total salary is = "+ total);
		
		
		
		
	   }
}