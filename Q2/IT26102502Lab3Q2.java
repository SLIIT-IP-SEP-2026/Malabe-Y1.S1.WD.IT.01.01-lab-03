import java.util.Scanner; 
public class IT26102502Lab3Q2{
	public static void main(String[] args){
     	Scanner input = new Scanner(System.in);
		 
		//input the monthly salary 
		System.out.println("Enter the salary: ");
		double salary = input.nextDouble();
		 
		//input the OT_hours 
		System.out.println("Enter the OT_hours: ");
		double OT_hours = input.nextDouble();
		
		//Input the OT_hourly_rate
		System.out.println("enter the OT_hourly_rate");
		double OT_hourly_rate = input.nextDouble();
		
		// calculating the full_salary
		double full_salary = salary + (OT_hours * OT_hourly_rate);
		
		
		//Displaing the final salary....		
		System.out.println("MONTHLY SALARY: " + full_salary);
	}
}