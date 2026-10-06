import java.util.Scanner;

public class IT26102434Lab3Q4 {
	public static void main (String[] args) {
		int number;
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five digit number: ");
		number = input.nextInt();
		
		digit1 = number / 10000;
		digit2 = (number / 1000) % 10;
		digit3 = (number / 100) % 10;
		digit4 = (number / 10) % 10;
		digit5 = number % 10;
		
		System.out.println();
		System.out.print(digit1 + " " );
		System.out.print(digit2 + " ");
		System.out.print(digit3 + " ");
		System.out.print(digit4 + " ");
		System.out.print(digit5 + " ");
		System.out.println();


	}
}