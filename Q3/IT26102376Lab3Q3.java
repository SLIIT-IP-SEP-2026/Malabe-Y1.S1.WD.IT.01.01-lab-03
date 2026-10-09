import java.util.Scanner;
public class IT26102376Lab3Q3
{
    public static void main(String[] args) 
	{
		int count5000;
		int count1000;
		int count500;
		int count200;
		int count100;
		int count50;
		int count20;
		int count10;
		int count05;
		int count02;
		int count01;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the rupee amount: ");
		int amount = input.nextInt();
		
		count5000 = amount / 5000;
		amount = amount % 5000;
		
		count1000 = amount / 1000;
		amount = amount % 1000;
		
		count500 = amount / 500;
		amount = amount % 500;
		
		count200 = amount / 200;
		amount = amount % 200;
		
		count100 = amount / 100;
		amount = amount % 100;
		
		count50 = amount / 50;
		amount = amount % 50;
		
		count20 = amount / 20;
		amount = amount % 20;
		
		count10 = amount / 10;
		amount = amount % 10;
		
		count05 = amount / 05;
		amount = amount % 05;
		
		count02 = amount / 02;
		amount = amount % 02;
		
		count01 = amount / 01;
		amount = amount % 01;
		
		System.out.println();
		System.out.println("5000 notes -" + count5000);
		System.out.println("1000 notes -" + count1000);
		System.out.println("500 notes -" + count500);
		System.out.println("200 notes -" + count200);
		System.out.println("100 notes -" + count100);
		System.out.println("50 notes -" + count50);
		System.out.println("20 notes -" + count20);
		System.out.println("10 notes -" + count10);
		System.out.println("05 notes -" + count05);
		System.out.println("02 notes -" + count02);
		System.out.println("01 notes -" + count01);
	}
 
}