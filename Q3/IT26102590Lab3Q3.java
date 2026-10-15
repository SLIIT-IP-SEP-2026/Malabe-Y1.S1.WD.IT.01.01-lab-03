import java.util.Scanner;

public class IT26102590Lab3Q3
{

	public static void main(String[] args)
	{
		int count5000 = 0;
		int count1000 = 0;
		int count500 = 0;
		int count200 = 0;
		int count100 = 0;
		int count50 = 0;
		int count20 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the Rupee amount:");
		int amount= input.nextDouble();
		
		int count5000 = amount/5000; 
		int amount= amount%5000;
		
		
		int count1000 = amount/1000;
		int amount= amount%1000;
		
		int count500 = amount/500;
		int amount= amount%500;
		
		int count200 = amount/200;
		int amount= amount%200;
		
		int count100 = amount/100;
		int amount= amount%100;
		
		int count50 = amount/50;
		int amount= amount%50;
		
		int count20 = amount/20;
		int amount= amount%20;
		
		int count10 = amount/10;
		int amount= amount%10;
		
		int count5 = amount/5;
		int amount= amount%5;
		
		int count2 = amount/2;
		int amount= amount%2;
		
		int count1 = amount/1;
		int amount= amount%1;
		
		system.out.println();
		system.out.println("5000 Notes- " +count5000);
		system.out.println("2000 Notes- " +count2000);
		system.out.println("1000 Notes- " +count1000);
		system.out.println("500 Notes- " +count500);
		system.out.println("200 Notes- " +count200);
		system.out.println("100 Notes- " +count100);
		system.out.println("50 Notes- " +count50);
		system.out.println("20 Notes- " +count20);
		system.out.println("10 Notes- " +count10);
		system.out.println("5 Coins- " +count5);
		system.out.println("2 Coins- " +count2);
		system.out.println("1 coins- " +count1);
		
		
		
		
		
		
		
		
	
			
			
		
	
	}
 
} 