import java.util.Scanner;

public class IT26102447Lab3Q1B {
	
	public static void main(String[] args) {
		
		double pricePerKg , quantutty , totalAmount , discount , totalAmountwithDiscount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of Kilograms you want to buy: ");
		quantutty = input.nextDouble();
		
		totalAmount = pricePerKg * quantutty;
		
		discount = totalAmount * 10 / 100;
		
		totalAmountwithDiscount = totalAmount - discount; 
		
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + totalAmountwithDiscount);
	}
}