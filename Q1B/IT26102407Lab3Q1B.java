import java.util.Scanner;
public class IT26102407Lab3Q1B{
	
	public static void main(String[]args){
		
		//creating scanner
		Scanner sc = new Scanner (System.in);
		
		//Getting the input and store it in a variable
		System.out.print("Enter the price of 1kg of rice: ");
		double PriceOf1kg = sc.nextDouble();
		
		//Getting the input and store it in a variable
		System.out.print("Enter the number of kilgrams you want to buy: ");
		double NoOfkg = sc.nextDouble();
		
		//Calculate the amount
		double Amount = PriceOf1kg*NoOfkg;
		
		//Giving 10% discount
		double DiscountedPrice = Amount*10/100;
		
		//Final amount to pay after the discount
		double FinalPrice = Amount - DiscountedPrice;
		
		//Print the final amount
		System.out.print("The total amount with 10% discount is: " + FinalPrice);
		
	}
	
}