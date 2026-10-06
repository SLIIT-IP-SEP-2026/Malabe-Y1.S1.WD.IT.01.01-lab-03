import java.util.Scanner;

public class IT26102450Lab3Q1B {

	public static void main ( String[] args){
	
	double pricePerkg , quantity , totalamount , discountTotalamount;
	
	Scanner input = new Scanner (System.in);
	System.out.print("Enter the price of 1kg of rice: ");
	pricePerkg = input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want to buy: ");
	quantity = input.nextDouble();
	
	totalamount = pricePerkg * quantity;
	
	discountTotalamount = totalamount - (( totalamount / 100) * 10);
	
	
	System.out.println();
	System.out.println("the total amount with 10% discount is :" + discountTotalamount);
	
}
}