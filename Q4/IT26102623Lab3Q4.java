import java.util.Scanner;
public class IT26102623Lab3Q4
{
		public static void main(String[]args)
		{
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the 5 digit Amount:");
				int Amount = input.nextInt();
				
			int num10000=0;
			num10000 = Amount/10000;
			Amount = Amount%10000;
			
			int num1000=0; 
			num1000 = Amount/1000;
			Amount = Amount%1000;
			
			int num100=0;
			num100 = Amount/100;
			Amount = Amount%100;
			
			int num10=0;
			num10= Amount/10;
			Amount = Amount%10;
			
			int num1=0;
			num1 = Amount/1;
			Amount = Amount%1;
			
			
			
			System.out.print(num10000 + " ");
			System.out.print(num1000 + " ");
			System.out.print(num100 + " ");
			System.out.print(num10 + " ");
			System.out.print(num1 + " ");
			
		}
}