import java.util.Scanner;
	public class IT26102481Lab3Q4{
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			int rupeeAmount,notes5000,notes1000,notes500,notes200,notes100,notes50,notes20,coins10,coins5,coins2,coins1;
			
				System.out.print("enter a rupee amount -");
				rupeeAmount = input.nextInt();
				
				notes5000 = rupeeAmount/5000;
				rupeeAmount = rupeeAmount%5000;
				
				notes1000 = rupeeAmount/1000;
				rupeeAmount = rupeeAmount%1000;
				
				notes500 = rupeeAmount/500;
				rupeeAmount = rupeeAmount%500;
				
				notes200 = rupeeAmount/200;
				rupeeAmount = rupeeAmount%200;
				
				notes100 = rupeeAmount/100;
				rupeeAmount = rupeeAmount%100;
				
				notes50 = rupeeAmount/50;
				rupeeAmount = rupeeAmount%50;
				
				notes20 = rupeeAmount/20;
				rupeeAmount = rupeeAmount%20;
				
				coins10 = rupeeAmount/10;
				rupeeAmount = rupeeAmount%10;
				
				coins5 = rupeeAmount/5;
				rupeeAmount = rupeeAmount%5;
				
				coins2 = rupeeAmount/2;
				rupeeAmount = rupeeAmount%2;
				
				coins1 = rupeeAmount/1;
				rupeeAmount = rupeeAmount%1;
				
				
						System.out.println("5000 notes =" +notes5000);
						System.out.println("1000 notes ="+notes1000);
						System.out.println("500 notes ="+notes500);
						System.out.println("200 notes ="+notes200);
						System.out.println("100 notes ="+notes100);
						System.out.println("50 notes ="+notes50);
						System.out.println("20 notes ="+notes20);
						System.out.println("10 coins ="+coins10);
						System.out.println("5 coins ="+coins5);
						System.out.println("2 coins ="+coins2);
						System.out.println("1 coins ="+coins1);

			
				
		}
	}