import java.util.Scanner;

public class IT26102641Lab3Q1B{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double price,kg;
	double total,discount,finalAmount;
	
	System.out.print("Enter the price of 1kg of rice: ");
	price=input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want to buy: ");
	kg=input.nextDouble();
	
	total=price*kg;
	discount=total*10.0/100;
	finalAmount=total-discount;
	
	System.out.println("");
	System.out.println("The total amount with 10% discount is: " + finalAmount);
	}
}