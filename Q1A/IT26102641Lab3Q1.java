import java.util.Scanner;

public class IT26102641Lab3Q1{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double price,total;
	double kg;
	
	System.out.print("Enter the price of 1kg of rice: ");
	price=input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want to buy: ");
	kg=input.nextDouble();
	
	total=price*kg;
	
	System.out.println("");
	System.out.println("The total amount is: " + total);
	}
}