import java.util.Scanner;

public class IT26102590Lab3Q2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the monthly salary:");
		double monthlySalary= input.nextDouble();
		
		System.out.print("Enter the number of OT hours:");
		double otHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate:");
		double hourlyRate = input.nextDouble();
		
		double otAmount= otHours * hourlyRate;
		double totalAmount= monthlySalary+otAmount;
		
		System.out.println();	
		System.out.println ("the total salary including OT is:" +totalAmount ); 
			
			
		
	
	}
 
} 