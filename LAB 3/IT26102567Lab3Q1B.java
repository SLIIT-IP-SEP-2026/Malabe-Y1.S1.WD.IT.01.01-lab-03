import java.util.Scanner;
import java.util.Locale;

public class IT26102567Lab3Q1B { 
    
    public static void main(String[] args) {
      
        // Declare the variables
        double pricePerKg, quantity, totalAmount, discount, finalAmount;
        
        // Use Locale.US to ensure standard decimal point (.) input reading
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
           
        // Prompt the user to enter price per kilogram of rice 
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        // Prompt the user to input the number of kilograms of rice  
        System.out.print("Enter the number of kilograms of rice you want to buy: "); 
        quantity = input.nextDouble();
        
        // Calculate total amount to be paid 
        totalAmount = pricePerKg * quantity;
        
        // Calculate 10% discount and final amount
        discount = totalAmount * 0.10;
        finalAmount = totalAmount - discount;

        // Display the results 
        System.out.println();
        System.out.println("The total amount is: " + totalAmount); 
        System.out.println("Discount (10%): " + discount);
        System.out.println("The final amount to pay is: " + finalAmount); 
        
        // Close scanner
        input.close();
    }
}