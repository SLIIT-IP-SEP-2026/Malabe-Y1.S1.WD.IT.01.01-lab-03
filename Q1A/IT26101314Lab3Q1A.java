import java.util.Scanner

public class IT26101314Lab3Q1A{
	
	public static void main(String[] args){
		
		//Declare the variables
		double pricePerKg , quantity , totalAmoumt;
		
		//Create a Scanner Object to read input
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter price per kilograme of rice
		System.out.print("Enter the price of 1kg of rice:");
		pricePerKg = input.nectDouble();
		
		//Promt the user to enter the number of kilograme they want to buy 
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantity = input.nextDouble();
		
		//Calculate the total amount to be paid
		totalAmoumt = pricePerKg*quantity
		
		//disply the total amount
		System.out.println();
		System.out.println("The total amount is: "+totalAmount);
		
	}	
	
}
	