import java.util.Scanner;
public class IT26100133Lab3Q2
{
public static void main(String[]args)
{
	double monthlysalary , OThours , totalsalary , OThourlyrate , OTamound;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the monthlysalary: ");
	monthlysalary = input.nextDouble();
	
	System.out.print("Enter the number of OT hours: ");
	OThours = input.nextDouble();
	
	System.out.print("Enter the OT hourly rate: ");
	OThourlyrate = input.nextDouble();

    OTamound = OThours * OThourlyrate;
	totalsalary = monthlysalary + OTamound;
	
	System.out.println();
	System.out.println("The total amount is: " + totalsalary);
	
   }	
}

