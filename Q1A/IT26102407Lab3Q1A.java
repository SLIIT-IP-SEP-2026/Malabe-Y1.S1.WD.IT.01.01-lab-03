import java.util.Scanner;
public class IT26102407Lab3Q1A{
	
	public static void main(String[]args){
		
		//creating scanner
		Scanner sc = new Scanner (System.in);
		
		//Getting the input and store it in a variable
		System.out.print("Enter the price of 1kg of rice: ");
		double PriceOf1kg = sc.nextDouble();
		
		//Getting the input and store it in a variable
		System.out.print("Enter the number of kilgrams you want to buy: ");
		double NoOfkg = sc.nextDouble();
		
		//Calculate the amount to pay
		double Amount = PriceOf1kg*NoOfkg;
		
		//Print the final amount
		System.out.print("The total amount is: " + Amount);
		
	}
	
}