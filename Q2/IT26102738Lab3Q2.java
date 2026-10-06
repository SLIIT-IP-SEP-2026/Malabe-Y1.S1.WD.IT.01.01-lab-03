import java.util.Scanner;

public class IT26102738Lab3Q2{
	public static void main(String []args){
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the Monthly Salary:");
		double MonSalary=input.nextDouble();
		
		System.out.print("Enter the number of OT hours:");
		double Othours=input.nextDouble();
		
		System.out.print("Enter the OT hourly rate:");
		double Othourrate=input.nextDouble();
		
		double Otamount=Othours*Othourrate;
		double TotSalary=MonSalary+Otamount;
		
		System.out.println("The total salary including Ot is " +TotSalary);
	}
}
	