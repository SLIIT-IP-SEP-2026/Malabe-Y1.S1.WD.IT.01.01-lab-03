import java.util.Scanner;
	public class IT26102532Lab3Q5{
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			
			int number,number1,number2,number3,number4,number5;
				
				System.out.print("enter a five digit number - ");
				number = input.nextInt();
				
				number1=number/10000;
				number=number%10000;
				
				number2=number/1000;
				number=number%1000;
				
				number3=number/100;
				number=number%100;
				
				number4=number/10;
				number=number%10;
				
				number5=number/1;
				number=number%1;
				
						
						System.out.println(number1+ " ");
						System.out.println(number2+ " ");
						System.out.println(number3+ " ");
						System.out.println(number4+ " ");
						System.out.println(number5+ " ");
		}
	}					