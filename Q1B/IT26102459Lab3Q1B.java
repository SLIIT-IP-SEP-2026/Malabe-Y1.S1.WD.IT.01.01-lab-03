import java.util.Scanner;

public class IT26102459Lab3Q1B{
	public static void main(String[]args){
		double priceOf1Kg,amountOfKgs,totalAmount;
		double discountRate = 0.1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		priceOf1Kg = input.nextInt();
		
		System.out.print("Enter the number of Kilograms you want to buy: ");
		amountOfKgs = input.nextInt();
		
		totalAmount=priceOf1Kg*amountOfKgs*(1-discountRate)	;
		
		System.out.println();
		System.out.println("The total amount with 10% discount is: "+ totalAmount);
	}
}