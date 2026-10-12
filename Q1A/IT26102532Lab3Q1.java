import java.util.Scanner;
	public class IT26102532Lab3Q1{
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			
			double pricePerKg,quantity,totlaAmount;
				System.out.print("enter the price of 1kg -");
				pricePerKg=input.nextDouble();
				
				System.out.print("enter the quantity -");
				quantity=input.nextDouble();
				
				totlaAmount=pricePerKg*quantity;
				
				System.out.print("the total amount ="+totlaAmount);
		}		
		
	}		