import java.util.Scanner;
	public class IT26102481Lab3Q3{
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			double monthlySalary,hourlyRate,totalSalary;
			int numberOfOtHours;
			
			System.out.print("enter the monthly salary - ");
			monthlySalary = input.nextDouble();
			
			System.out.print("enter the number of ot hours - ");
			numberOfOtHours = input.nextInt();
			
			System.out.print("enter the ot hourly rate - ");
			hourlyRate = input.nextDouble();
			
			
			totalSalary = monthlySalary+numberOfOtHours*hourlyRate;
			
			
			System.out.print("the total salary ingluding ot is ="+totalSalary);
			
				
		}
	}