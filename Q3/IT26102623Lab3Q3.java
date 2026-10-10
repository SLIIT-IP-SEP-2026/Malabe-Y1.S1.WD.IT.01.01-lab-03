import java.util.Scanner;
public class IT26102623Lab3Q3
{
		public static void main(String[]args)
		{
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the Amount:");
				int Amount = input.nextInt();
				
			int Notes5000=0;
			Notes5000 = Amount/5000;
			Amount = Amount%5000;
			
			int Notes1000=0; 
			Notes1000 = Amount/1000;
			Amount = Amount%1000;
			
			int Notes500=0;
			Notes500 = Amount/500;
			Amount = Amount%500;
			
			int Notes200=0;
			Notes200 = Amount/200;
			Amount = Amount%200;
			
			int Notes100=0;
			Notes100 = Amount/100;
			Amount = Amount%100;
			
			int Notes50=0;
			Notes50 = Amount/50;
			Amount = Amount%50;
			
			int Notes20=0;
			Notes20 = Amount/20;
			Amount = Amount%20;
			
			int Notes10=0;
			Notes10 = Amount/10;
			Amount = Amount%10;
			
			int Notes05=0;
			Notes05 = Amount/05;
			Amount = Amount%05;
			
			int Notes02=0;
			Notes02 = Amount/02;
			Amount = Amount%02;
			
			int Notes01=0;
			Notes01 = Amount/01;
			Amount = Amount%01;
			
			System.out.println("5000 Notes = "+ Notes5000);
			System.out.println("1000 Notes = "+ Notes1000);
			System.out.println("500 Notes = "+ Notes500);
			System.out.println("200 Notes = "+ Notes200);
			System.out.println("100 Notes = "+ Notes100);
			System.out.println("50 Notes = "+ Notes50);
			System.out.println("20 Notes = "+ Notes20);
			System.out.println("10 Notes = "+ Notes10);
			System.out.println("05 Notes = "+ Notes05);
			System.out.println("02 Notes = "+ Notes02);
			System.out.println("01 Notes = "+ Notes01);
		}
}
			
			
			
			
			
			
			
			