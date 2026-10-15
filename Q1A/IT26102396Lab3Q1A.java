import java.util.Scanner;

public class IT26102396Lab3Q1A{

	public static void main(String[] args){
		
		double pricePerKg , quantity , toatalAmount;
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the price of 1Kg of rice:  ");
		pricePerKg = input.nextDouble();
		
		
		System.out.print(" Enter the number of kilogrames you want to buy:  ");
		quantity = input.nextDouble();
		
		toatalAmount = pricePerKg * quantity;
		
		System.out.println();
		System.out.println("The total amount is: " + toatalAmount);
		
		
		
	}

}