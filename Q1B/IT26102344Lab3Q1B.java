import java.util.Scanner;

	public class IT26102344Lab3Q1B{
		
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			double pricePerKg,quantity,totalAmount,afterDiscount,discount;
			
				System.out.print("enter the price of 1kg -");
				pricePerKg = input.nextDouble();
				
				System.out.print("enter the quantity -");
				quantity = input.nextDouble();
				
				totalAmount = pricePerKg*quantity;
				discount = totalAmount*10/100;
				afterDiscount = totalAmount - discount;
				
				System.out.println("The total amount with 10% discount =" +afterDiscount);
				
				
				
					
		}
	}