import java.util.Scanner;

public class IT26102590Lab3Q1A
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the price of 1kg of rice:");
		double priceOf1kgRice= input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		double amountOfKilograms = input.nextDouble();
		
		double totalAmount= priceOf1kgRice * amountOfKilograms;
		
		System.out.println();	
		System.out.println ("Total Amount:" +totalAmount ); 
			
			
		
	
	}
 
} 