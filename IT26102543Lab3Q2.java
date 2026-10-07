import java.util.Scanner;
public class IT26102543Lab3Q2{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the monthly salary:");
		double MonthlySalary=input.nextDouble();
		System.out.print("Enter the number of OT hours:");
		double OThours=input.nextDouble();
		System.out.print("Enter the OT hourly rate:");
		double OTHourlyRate=input.nextDouble();
		double OTAmount=OThours*OTHourlyRate;
		double TotalSalary= MonthlySalary+OTAmount;
	System.out.print("The total salary including OT is:"+TotalSalary);}
}