import java.util.Scanner;

public class IT26102590Lab3Q4
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the five digit number:");
		int number= input.nextInt();
		
		int count1 = number/10000; 
		int number = number%10000;
		
		int count2 = number/1000; 
		int number = number%1000;
		
		int count3 = number/100; 
		int number = number%100;
		
		int count4 = number/10; 
		int number = number%10;
		
		int count5 = number/1; 
		int number = number%1;
		
		
		
		
		system.out.println();
		system.out.println(count1 + " ");
		system.out.println(count2 + " ");
		system.out.println(count3 + " ");
		system.out.println(count4 + " ");
		system.out.println(count5 + " ");
		
		
		
		
		
		
		
		
		
	
			
			
		
	
	}
 
} 