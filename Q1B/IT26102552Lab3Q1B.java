import java.util.Scanner;

public class IT26102552Lab3Q1B {
	public static void main(String[] args)
	{
		double amount, amount1, amount2,  TotalBill;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Price of one kilogram of rice:");
		amount1 = input.nextDouble() ;
		
		System.out.print("Enter the number of kilograms you want to buy:");
		amount2 = input.nextDouble() ;
		
	
		TotalBill = amount1 * amount2;
		
		amount = TotalBill - (TotalBill * 10/100) ;
		
		
		System.out.println();
		System.out.println(" The total amount with 10% discount = " + amount);
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
	}