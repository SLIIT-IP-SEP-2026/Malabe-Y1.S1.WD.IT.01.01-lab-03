// Q3

import java.util.Scanner;

public class IT26300584Lab3Q3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount : Rs. ");
		int Amount = sc.nextInt();
		
		int Note5000 = Amount/5000;
		Amount %= 5000;
		System.out.println("5000 Notes " + Note5000);
		
		int Note1000 = Amount/1000;
		Amount %= 1000;
		System.out.println("1000 Notes " + Note1000);
		
		int Note500 = Amount/500;
		Amount %= 500;
		System.out.println("500 Notes " + Note500);
		
		int Note200 = Amount/200;
		Amount %= 200;
		System.out.println("200 Notes " + Note200);
		
		int Note100 = Amount/100;
		Amount %= 100;
		System.out.println("100 Notes " + Note100);
		
		int Note50 = Amount/50;
		Amount %= 50;
		System.out.println("50 Notes " + Note50);
		
		int Note20 = Amount/20;
		Amount %= 20;
		System.out.println("20 Notes " + Note20);
		
		int Note10 = Amount/10;
		Amount %= 10;
		System.out.println("10 Notes " + Note10);
		
		int Note05 = Amount/05;
		Amount %= 05;
		System.out.println("05 Notes " + Note05);
		
		int Note02 = Amount/02;
		Amount %= 02;
		System.out.println("02 Notes " + Note02);
		
		int Note01 = Amount/01;
		Amount %= 01;
		System.out.println("01 Notes " + Note01);
	}
}
		
		
		
		
		
