import java.util.Scanner;

public class IT26102648Lab3Q4{
	public static void main(String[]args){
		int digit1,digit2,digit3,digit4,digit5,amount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number :");
		amount = input.nextInt();
		
		digit1 = amount / 10000;
		amount = amount % 10000;
		
		digit2 = amount / 1000;
		amount = amount % 1000;

		digit3 = amount / 100;
		amount = amount % 100;
		
		digit4 = amount / 10;
		amount = amount % 10;
		
		digit5 = amount / 1;
		amount = amount % 1;
		
		System.out.print(digit1);
		System.out.print(" "+digit2);
		System.out.print(" "+digit3);
		System.out.print(" "+digit4);
		System.out.print(" "+digit5);
	}
}