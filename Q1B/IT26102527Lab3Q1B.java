import java.util.Scanner;

public class IT26102527Lab3Q1B{
	public static void main(String[] args) {
		double price, noKilogram, totalAmount,discount,finalAmount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1 kg rice: ");
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		noKilogram = input.nextDouble();
		
		totalAmount = price * noKilogram;
		discount = totalAmount * (10/100);
		finalAmount = totalAmount - discount;
		
		System.out.println();
		System.out.println("The total amount with 10% is: " + finalAmount);
	}
}