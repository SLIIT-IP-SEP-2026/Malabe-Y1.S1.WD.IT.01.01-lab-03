import java.util.Scanner;

public class IT26102552Lab3Q2 {
	
	public static void main(String[] args)
	{
		double monthlysalary, numberofOThours, OThourlyrate,  totalsalary, OTAmount ;
				
				Scanner input = new Scanner(System.in);
				System.out.print("Enter monthly salary :");
				monthlysalary = input.nextDouble();

				System.out.print("Enter number of OT hours :");
				numberofOThours = input.nextDouble();
				
				System.out.print("Enter OT hourly rate :");
				OThourlyrate= input.nextDouble();
		
				OTAmount = numberofOThours * OThourlyrate;
				totalsalary = monthlysalary + OTAmount;
				
				System.out.println();
		System.out.println(" The total salary including OT is = " +totalsalary );
		System.out.println();
		
		
		
		
		
		
	}
}