import java.util.Scanner;
	public class IT26102532Lab3Q4{
		public static void main(String[]args){
			
			Scanner input = new Scanner(System.in);
			
			int rupeeAmount,notea5000,notea1000,notea500,notea200,notea100,notea50,notea20,coins10,coins5,coins2,coins1;
			
				System.out.print("enter a rupee amount - ");
				rupeeAmount = input.nextInt();
				
				notea5000 = rupeeAmount/5000;
				rupeeAmount = rupeeAmount%5000;
				
				notea1000 = rupeeAmount/1000;
				rupeeAmount = rupeeAmount%1000;
				
				notea500 = rupeeAmount/500;
				rupeeAmount = rupeeAmount%500;
				
				notea200 = rupeeAmount/200;
				rupeeAmount = rupeeAmount%200;
				
				notea100 = rupeeAmount/100;
				rupeeAmount = rupeeAmount%100;
				
				notea50 = rupeeAmount/50;
				rupeeAmount = rupeeAmount%50;
				
				notea20 = rupeeAmount/20;
				rupeeAmount = rupeeAmount%20;
				
				coins10 = rupeeAmount/10;
				rupeeAmount = rupeeAmount%10;
				
				coins5 = rupeeAmount/5;
				rupeeAmount = rupeeAmount%5;
				
				coins2 = rupeeAmount/2;
				rupeeAmount = rupeeAmount%2;
				
				coins1 = rupeeAmount/1;
				rupeeAmount = rupeeAmount%1;
					
						
						
						System.out.println("5000 notes"+notea5000);
						System.out.println("1000 notes"+notea1000);
						System.out.println("500 notes"+notea500);
						System.out.println("200 notes"+notea200);
						System.out.println("100 notes"+notea100);
						System.out.println("50 notes"+notea50);
						System.out.println("20 notes"+notea20);
						System.out.println("10 coins"+coins10);
						System.out.println("5 coins"+coins5);
						System.out.println("2 coins"+coins2);
						System.out.println("1 coins"+coins1);
		}
	}