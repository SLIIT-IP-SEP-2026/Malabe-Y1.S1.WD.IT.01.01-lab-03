import java.util.Scanner;

public class IT26102298Lab3Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly sa;ary: ");
		double monthlysalary = Scanner.nextdouble();
		
		System.out.print("Enter the numbetr of OT hours; ");
		double otHourse = Scanner.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		double otrate = Scanner.nextDouble();

        double otAmount = otHourse * otrate;
		double totalSalary = monthlysalary + otAmount;
		
		System.out.println("\nThe total salary including OT is: " + totalSalary);
		
		Scanner.close();
	}
}	