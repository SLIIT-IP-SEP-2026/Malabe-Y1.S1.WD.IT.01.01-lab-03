import java.util.Scanner;

public class IT26102447Lab3Q1A {
	
	public static void main(String[] args) {
		
		double pricePerKg , quantutty , totalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of Kilograms you want to buy: ");
		quantutty = input.nextDouble();
		
		totalAmount = pricePerKg * quantutty;
		
		System.out.println();
		System.out.println("The total amount is: " + totalAmount);
	}
}