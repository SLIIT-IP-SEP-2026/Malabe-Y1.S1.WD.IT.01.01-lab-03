import java.util.Scanner;

  public class IT26102671Lab3Q1A
  {
      public static void main(String[]args)
	  {
	    //declare variables
           double pricePerKg , quantity , totalAmount ;

        // Create a scanner objext to read input
            Scanner input = new Scanner (System.in);
    
        //prompt the user to enter the price per kilogram of rice
        System.out.print("Enter the price of 1Kg of rice:");
        pricePerKg = input.nextDouble();

        //prompt the user to enter the number of kilograms they want to buy
		System.out.print("Enter the number of kilograms you want to buy");
		quantity = input.nextDouble();
		
		//calculate the total amount to be paid
		totalAmount = pricePerKg * quantity;
		
		//Display the total amount
		System.out.println();
		System.out.println("The total amount is: " + totalAmount);
		
		
	   }
	   
   }   