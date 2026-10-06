import java.util.Scanner;
    public class It26102417Lab3Q1B{
    public static void main (String[]args){
	double price,kilograms,amount;
	
	Scanner input = new Scanner(System.in); 
	
    System.out.print("Enter the price of 1kg: ");
    price = input.nextDouble();	
	System.out.print(" Enter the number of kilograms you want to buy: ");
    kilograms = input.nextDouble();
    
	
	
    amount = price * kilograms  * 0.9;
	
	System.out.println(" the   amount with 10% disscount is: " + amount );
  
  
     } 
  }