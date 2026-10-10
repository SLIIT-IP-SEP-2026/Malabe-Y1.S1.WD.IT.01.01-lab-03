import java.util.Scanner;
public class IT26102623Lab3Q1A
{
		public static void main(String[]args)
		{
				Scanner input=new Scanner(System.in);
				
				System.out.print("Enter the price of 1kg Rice:");
				double priceof1kgofrice = input.nextDouble();
				
				System.out.print("Enter the kilograms you want to buy:");
				double numberofkilogramsyouwanttobuy = input.nextDouble();
				
				double totalamount = priceof1kgofrice * numberofkilogramsyouwanttobuy;
				System.out.print("Total amount is "+totalamount);
		}
}