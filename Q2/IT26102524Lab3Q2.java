import java.util.Scanner;
public class IT26102524Lab3Q2
{
	public static void main(String[]args)
	{
		double monthlysalary,othours,otrate,otamount,totalsalary;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the monthly salary:");
		monthlysalary=input.nextDouble();
		
		System.out.print("Enter the monthly of OT hours:");
		othours=input.nextDouble();
		
		System.out.print("Enter the OT hourly rate:");
		otrate=input.nextDouble();
		
		otamount=othours*otrate;
		totalsalary=monthlysalary+otamount;
		
		System.out.println();
		System.out.print("The total salary including OT is:"+totalsalary);
		
	}
}