import java.util.Scanner;

public class IT26102298Lab3Q1B {
	
	public static void main (String[] args) {
		
		double priceperKg , quantutty ,totalAmount , discount , totalAmountwithdiscount;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the price of 1Kg of rice; ");
		priceperKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantutty = input.nextDouble();
		
		totalAmount = priceperKg * quantutty;
		
		discount = totalAmount * 10 / 100;
		
		totalAmountwithdiscount = totalAmount - discount;
		
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + totalAmountwithdiscount) ; 
	}
}