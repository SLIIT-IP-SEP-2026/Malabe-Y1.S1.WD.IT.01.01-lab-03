import java.util.Scanner;
public class IT26102623Lab3Q1B
{
		public static void main(String[]args)
		{
				Scanner input=new Scanner(System.in);
				
				System.out.print("Enter the price of 1kg Rice:");
				double priceof1kgofrice = input.nextDouble();
				
				System.out.print("Enter the kilograms you want to buy:");
				double numberofkilogramsyouwanttobuy = input.nextDouble();
				
				double totalamount = priceof1kgofrice * numberofkilogramsyouwanttobuy;
				System.out.println("Total amount is "+totalamount);
				
				double discount = totalamount * 10/100;
				System.out.println("Dicount amount is "+ discount);
				
				double totalamountwithdiscount = totalamount - discount;
				System.out.println("total amount with discount is "+ totalamountwithdiscount);
		}
}