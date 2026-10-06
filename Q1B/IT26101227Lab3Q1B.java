import java.util.Scanner;

public class IT26101227Lab3Q1B {
	
	public static void main(String[] args){
	
		double pricePerKg, quantity, totalAmount, discountAmount, finalAmount; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of the 1kg of rice; ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy; ");
		quantity = input.nextDouble();
		
		totalAmount = pricePerKg * quantity;
		
		discountAmount = totalAmount * 10 / 100;
		
		finalAmount = totalAmount - discountAmount;
		
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + finalAmount);
	}

}