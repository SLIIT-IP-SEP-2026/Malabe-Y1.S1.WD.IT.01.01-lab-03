import java.util.Scanner;
	public class IT26102344Lab3Q4{
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			int number,number1,number2,number3,number4,number5 ;
			
				System.out.print("Enter a five digit number :");
			    number = input.nextInt();
				
				number1 = number/10000;
				number = number%10000;
				
				number2 = number/1000;
				number = number%1000;
				
				number3 = number/100;
				number = number%100;
				
				number4 = number/10;
				number = number%10;
				
				number5 = number/1;
				number = number%1;
				
				
						System.out.print(number1+" ");
						System.out.print(number2+" ");
						System.out.print(number3+" ");
						System.out.print(number4+" ");
						System.out.print(number5+" ");
						

			
				
		}
	}