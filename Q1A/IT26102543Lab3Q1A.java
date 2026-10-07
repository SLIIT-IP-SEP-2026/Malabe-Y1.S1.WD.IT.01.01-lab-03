import java.util.Scanner;
public class IT26102543Lab3Q1A{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		double pricePerKg=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		double quantity=input.nextDouble();
		double totalAmount=pricePerKg *quantity;
	System.out.print("The total amount is:"+ totalAmount);}
}
		
		