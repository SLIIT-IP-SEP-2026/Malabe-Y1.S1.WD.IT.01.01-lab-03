// Q 1B

import java.util.Scanner;

public class IT26300584Lab3Q1B
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of Rice : Rs. ");
		double priceOf1KgRice = sc.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy : ");
		double NumOfKgs = sc.nextDouble();
		
		double totAmount = priceOf1KgRice * NumOfKgs;
		
		double discount = 10.0 / 100;
		
		//double discountAmount = totAmount*discount;
		
		//System.out.println("the Discount Amount is " + discountAmount);
		
		double totBill = totAmount-(totAmount*discount);
		
		System.out.println();
		System.out.println("The Total Amount with 10% discount is Rs. " + totBill);
	}
}