import java.util.Scanner;
public class IT26102407Lab3Q4{
	
	public static void main(String[]args){
		
		//Creating Scanner
		Scanner sc = new Scanner (System.in);
		
		//Getting the five-digit number
		System.out.print("Enter a five-digit number: ");
		int number = sc.nextInt();
		
		//Getting each digit to a variable
		int digit1 = number / 10000;
		int digit2 = (number/1000)%10;
		int digit3 = (number/100)%10;
		int digit4 = (number/10)%10;
		int digit5 = number%10;
		
		//Display the output
		System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
		
	}
	
}