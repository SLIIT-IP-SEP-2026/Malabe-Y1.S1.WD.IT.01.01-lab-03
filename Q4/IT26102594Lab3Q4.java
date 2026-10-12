import java.util.Scanner;

public class IT26102594Lab3Q4{
	public static void main(String []args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a five-digit number:");
		int fivedigitnumber=input.nextInt();
		
		int no1=fivedigitnumber/10000;
		int no2=(fivedigitnumber/1000)%10;
		int no3=(fivedigitnumber/100)%10;
		int no4=(fivedigitnumber/10)%10;
		int no5=fivedigitnumber%10;
		
		System.out.println( no1 + " " + no2 + " " + no3 + " " + no4 + " " + no5);
    }
}