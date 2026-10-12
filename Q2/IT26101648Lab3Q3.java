import java.util.Scanner;
	public class IT26101648Lab3Q3{
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			
			double mounthlySalary,hourlyRate,totalSalary;
			int numberOfOtHours;
			
			System.out.print("Enter the mounthly Salary - ");
			mounthlySalary=input.nextDouble();
			
			System.out.print("Enter the number Of Ot Hours - ");
			numberOfOtHours=input.nextInt();
			
			System.out.print("Enter the ot hourly Rate - ");
			hourlyRate = input.nextDouble();
			
			totalSalary = mounthlySalary+numberOfOtHours*hourlyRate;
			
			System.out.print("the totla salary including is = "+totalSalary);
		}
	}