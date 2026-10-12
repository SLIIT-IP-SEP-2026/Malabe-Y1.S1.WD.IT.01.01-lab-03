import java.util.Scanner;
	public class IT26101648Lab3Q2{
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			double mounthlySalary,numOT,hourlyOTrate,amountOT,totalSalary;
			
				System.out.print("Enter the Mounthly Salary= ");
				 mounthlySalary= input.nextDouble();
				 
				System.out.print("Enter the number of hours = ");
				 numOT=input.nextDouble();
				 
				System.out.print("Enter the OT hourly rate = ");
				 hourlyOTrate=input.nextDouble();
				 
				amountOT=numOT*hourlyOTrate;
				totalSalary = mounthlySalary+amountOT;
				
				System.out.println("The Total salary including OT is :"+totalSalary);
				
				
				
				
				
				
				
				
		}
	}		