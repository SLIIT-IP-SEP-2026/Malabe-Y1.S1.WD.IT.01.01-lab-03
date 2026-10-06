import java.util.Scanner;
	public class IT26102481Lab3Q1{
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			double pricePerKg,quantity,totalAmount;
			
				System.out.print("enter the price of 1kg -");
				pricePerKg = input.nextDouble();
				
				System.out.print("enter the quantity -");
				quantity = input.nextDouble();
				
				totalAmount = pricePerKg*quantity;
				
				System.out.print("the total amount ="+totalAmount);
				
				
				
					
		}
	}