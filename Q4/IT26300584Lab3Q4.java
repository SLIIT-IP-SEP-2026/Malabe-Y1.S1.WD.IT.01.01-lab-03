// Q4

import java.util.Scanner;

public class IT26300584Lab3Q4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a five digit number : ");
		int digit = sc.nextInt();
		
		int Num10000 = digit/10000;
		digit = digit % 10000;
		
		int Num1000 = digit/1000;
		digit = digit % 1000;
		
		int Num100 = digit/100;
		digit = digit % 100;
		
		int Num10 = digit/10;
		digit = digit % 10;
		
		
		int Num1 = digit/1;
		digit = digit % 1;
		
		System.out.print(Num10000 + " " + Num1000 + " " + Num100 + " " + Num10 + " " + Num1);
	}
}
		
		