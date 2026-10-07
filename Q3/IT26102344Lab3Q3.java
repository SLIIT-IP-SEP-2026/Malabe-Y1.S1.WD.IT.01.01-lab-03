import java.util.Scanner;
	public class IT26102344Lab3Q3{
		public static void main(String[] arg){
			
			Scanner input = new Scanner(System.in);
			
			int rupeeAmount,notes5000,notes1000,notes500,notes200,notes100,notes50,notes20,notes10,notes5,notes2,notes1;
			
				System.out.print("Enter a rupee amount -");
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
				
				notes10 = rupeeAmount/10;
				rupeeAmount = rupeeAmount%10;
				
				notes5 = rupeeAmount/5;
				rupeeAmount = rupeeAmount%5;
				
				notes2 = rupeeAmount/2;
				rupeeAmount = rupeeAmount%2;
				
				notes1 = rupeeAmount/1;
				rupeeAmount = rupeeAmount%1;
				
				
						System.out.println("5000 notes =" +notes5000);
						System.out.println("1000 notes ="+notes1000);
						System.out.println("500 notes ="+notes500);
						System.out.println("200 notes ="+notes200);
						System.out.println("100 notes ="+notes100);
						System.out.println("50 notes ="+notes50);
						System.out.println("20 notes ="+notes20);
						System.out.println("10 notes ="+notes10);
						System.out.println("5 notes ="+notes5);
						System.out.println("2 notes ="+notes2);
						System.out.println("1 notes ="+notes1);

			
				
		}
	}