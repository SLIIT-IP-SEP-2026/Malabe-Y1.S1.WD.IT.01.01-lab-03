import java.util.Scanner;
	public class IT26102481Lab3Q2{
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			double pricePerKg,quantity,totalAmount,afterDiscountTotal;
			
				System.out.print("enter the price of 1kg -");
				pricePerKg = input.nextDouble();
				
				System.out.print("enter the quantity -");
				quantity = input.nextDouble();
				
				totalAmount = pricePerKg*quantity;
				afterDiscountTotal=totalAmount/100*90;
				
				System.out.print("total amount with 10% discount ="+afterDiscountTotal);
				
				
				
					
		}
	}