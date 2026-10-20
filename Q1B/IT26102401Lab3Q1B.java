import java.util.Scanner;

public class IT26102401Lab3Q1B {
    public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		
		double price,total,discount,amount;
		int kilograms;
		
		System.out.print("Enter te price of 1kg of rice:");
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		kilograms = input.nextInt();
		 
		total = price * kilograms;
		discount = total * 0.10;
		amount = total - discount;
		
		System.out.println();
		System.out.println("The total amount with 10% discount is :" + amount);
		
		
	}
}	