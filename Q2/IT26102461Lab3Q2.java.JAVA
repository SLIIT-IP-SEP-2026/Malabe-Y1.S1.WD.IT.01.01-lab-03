import java.util.Scanner;

public class IT26102461Lab3Q2 {
	 public static void main(String[]args) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter the monthly salary: ");
		 double monthlySalary=input.nextDouble();
		 
		 System.out.print("Enter the number of OT hours: ");
		 double otHours=input.nextDouble();
		 
		 System.out.print("Enter the OT hourly rate: ");
		 double otHourlyrate=input.nextDouble();
		 
		 double otAmount=otHours*otHourlyrate;
		 double totalSalary=monthlySalary+otAmount;
		 
		 System.out.println("The total salaryincluding OT is: "+totalSalary); 
		 
		     input.close();
			 
	 }
}	 