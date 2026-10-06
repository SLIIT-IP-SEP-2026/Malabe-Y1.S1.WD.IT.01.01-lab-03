import java.util.Scanner;
public class IT26102550Lab3Q1A{

	public static void main(String[]args) {
	
	//Declare the variables
	double pricePerKg , quantity , totalAmount;
	
	//create a scanner object to read input
	Scanner input = new Scanner(System.in);
	
	//Prompt the user to enter the price per kilogram of rice
	System.out.print("Enter the price of 1kg of rice: ");
	pricePerKg = input.nextDouble();
	
	//prompt the user to enter the number of kilogrmas  they want to buy
	System.out.print("Enter the number of kilograms you want to buy: ");
	quantity = input.nextDouble();
	
	//Calculate the total amount to be paid
	totalAmount = pricePerKg * quantity;
	
	//Display the total amount
	System.out.println();
	System.out.println("The total amount is: " + totalAmount);
	}
}
	