import java.util.Scanner;

public class IT26102298Lab3Q1A {

public static void main(String[]args){	
    double priceperKg,quantity,totalAmount;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print( "Enter the price of 1kg of rice: ");
    priceperKg = input.nextDouble(); 
	
	System.out.print("Enter the  number of Kilograms you want to buy: "); 
	quantity = input.nextDouble();
	
	totalAmount = priceperKg * quantity;
	
	System.out.println();
	System.out.println ("The total amount is : " +  totalAmount);
	
   }
}