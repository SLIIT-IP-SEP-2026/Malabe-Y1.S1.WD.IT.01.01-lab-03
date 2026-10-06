import java.util.Scanner;

public class IT26102475Lab3Q1A{

public static void main(String[] args ) {

// Declare the variables
double pricePerKg ,quantity , totalAmount ;

//create a scanner object to read input
Scanner input = new Scanner(System.in);

//prompt the user to enter the price per kilogtam of rice 
System.out.print("enter the price of 1kg of rice: ");
pricePerKg = input.nextDouble();

//prompt the user to enter the number of kilograms they want to buy 
System.out.print("Enter the number of kilograms you want to buy: ");
quantity = input.nextDouble();


//calculate the total amount to be paid
totalAmount =pricePerKg * quantity;

// Display the total amount 
System.out.println();
System.out.println ("The total amount is : " + totalAmount);

}
}
