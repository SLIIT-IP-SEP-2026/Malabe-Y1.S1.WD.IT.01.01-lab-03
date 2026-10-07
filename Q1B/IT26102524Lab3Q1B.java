import java.util.Scanner;
public class IT26102524Lab3Q1B
{
	public static void main(String[]args)
	{
		double price,numberofkg,discount,totamount,discounttotamount;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice:");
		price=input.nextDouble();
		
		System.out.print("Enter the number of kilogarmes you want to buy:");
		numberofkg=input.nextDouble();
		totamount=price*numberofkg;
		
		discount=totamount*10/100;
		discounttotamount=totamount-discount;
		
		System.out.print("The total amount with 10% discount is:"+discounttotamount);
	}
}