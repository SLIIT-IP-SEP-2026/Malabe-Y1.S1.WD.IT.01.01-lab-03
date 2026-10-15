import java.util.Scanner;
public class IT26102386Lab3Q1B
{
	public static void main(String[]args)
	{
		double pricePerKg,quantity,discountPrice,totalBill;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		pricePerKg=input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy:");
		quantity=input.nextDouble();
		totalBill=pricePerKg*quantity;
		discountPrice=totalBill*0.90;
		System.out.print("Total Amount with 10% discount="+discountPrice);
	}
}