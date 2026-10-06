import java.util.Scanner;

public class IT26102529Lab3Q1A
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		double price,kilograms,Totalamount;
		
		System.out.println("Enter the price of 1 Kg of rice: ");
		price=input.nextDouble();
		
		System.out.println("Enter the no kgs you want to buy: ");
		kilograms=input.nextDouble();
		
		Totalamount=price*kilograms;
		
		System.out.println("The total amount is: "+Totalamount);
	}
}