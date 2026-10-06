import java.util.Scanner;

public class IT26102648Lab3Q1A{
	public static void main(String[]args){
		double priceOf1Kg,amountOfKgs,totalAmount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1Kg of rice: ");
		priceOf1Kg = input.nextInt();
		System.out.print("Enter the number of Kilograms you want to buy: ");
		amountOfKgs = input.nextInt();
		totalAmount=priceOf1Kg*amountOfKgs;
		System.out.println();
		System.out.println("The total amount is: "+ totalAmount);
	}
}