import java.util.Scanner;

	public class IT26102344Lab3Q2{
		
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			double monthlySalary,numOT,hourlyOTrate,amountOT,totalSalary;
			
				System.out.print("Enter the monthly salary =");
				 monthlySalary = input.nextDouble();
				
				System.out.print("Enter the number of OT hours =");
				 numOT = input.nextDouble();
				 
				System.out.print("Enter the OT hourly rate =");
				  hourlyOTrate = input.nextDouble();
				
				amountOT = numOT * hourlyOTrate;
				totalSalary = monthlySalary + amountOT;
				
			    System.out.println("The total salary including OT is :"+totalSalary);
				
				
				
					
		}
	}