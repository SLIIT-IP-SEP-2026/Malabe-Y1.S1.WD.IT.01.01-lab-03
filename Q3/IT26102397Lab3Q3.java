import java.util.Scanner;

public class IT26102397Lab3Q3{
	public static void main(String []args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the rupee amount: ");
        int amount = input.nextInt();
		System.out.println();
		
		int notes5000=amount/5000;
        amount=amount%5000;
		
		int notes1000=amount/1000;
        amount=amount%1000;
		
		int notes500=amount/500;
        amount=amount%500;
		
		int notes200=amount/200;
        amount=amount%200;
		
		int notes100=amount/100;
        amount=amount%100;
		
		int notes50=amount/50;
        amount=amount%50;
		
		int notes20=amount/20;
        amount=amount%20;
		
		int notes10=amount/10;
        amount=amount%10;
		
		int notes05=amount/05;
        amount=amount%05;
		
		int notes02=amount/02;
        amount=amount%02;
		
		int notes01=amount/01;
        amount=amount%01;
		
		System.out.println("5000 notes" +notes5000);
		System.out.println("1000notes" +notes1000);
		System.out.println("500 notes" +notes500);
		System.out.println("200 notes" +notes200);
		System.out.println("100 notes" +notes100);
		System.out.println("50 notes" +notes50);
		System.out.println("20 notes" +notes20);
		System.out.println("10 notes" +notes10);
		System.out.println("05 notes" +notes05);
		System.out.println("02 notes" +notes02);
		System.out.println("01 notes" +notes01);
	}
}