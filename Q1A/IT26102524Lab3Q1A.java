import java.util.Scanner;
public class IT26102524Lab3Q1A
{
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Enter the price of  1kg of Rice:");
		double price=sc.nextDouble();
		
		
		System.out.print("Enter the number of kilograms younwant to buy:");
		double number=sc.nextDouble ();
		double totalamount;
		totalamount=price*number;
		System.out.print("The amount is:"+totalamount);
		
	}

}