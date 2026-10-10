import java.util.Scanner;

public class IT26102567Lab3Q1A { 
    
	public static void main(String[]args){
	  
	  // Declare the variables
	  double pricePerKg, quantity, totalAmount;
    
	 // Create new scanner object to read input from keyboard
       Scanner input = new Scanner(System.in);
       
     // Prompt the user to enter price per kilogram of rice 
     System.out.print("Enter the price of 1kg of rice: ");
     pricePerKg = input.nextDouble();

     // Prompt the user to input the number of kilograms of rice  
	 System.out.print("Enter the number of kilograms of rice you want to buy: "); 
	 quantity = input.nextDouble();
	
	 // Calculate total amount to be paid 
	 totalAmount = pricePerKg * quantity;
	
	 // Display the total amount 
	 System.out.println();
	 System.out.println("The total amount is: " + totalAmount); 
	}
 
} 
 

  