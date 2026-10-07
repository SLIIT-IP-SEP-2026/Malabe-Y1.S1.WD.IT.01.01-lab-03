// Q 1A

import java.util.Scanner;

public class IT26300584Lab3Q1A
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of Rice : Rs. ");
		double priceOf1KgRice = sc.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy : ");
		double NumOfKgs = sc.nextDouble();
		
		double totAmount = priceOf1KgRice*NumOfKgs;
		
		System.out.print("The Total Amount is Rs. " + totAmount);
	}
}