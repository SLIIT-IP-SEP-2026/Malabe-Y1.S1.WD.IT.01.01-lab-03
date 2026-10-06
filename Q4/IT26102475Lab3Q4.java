
import java.util.Scanner;

public class IT26102475Lab3Q4{
	public static void main(String []args){

//create a scanner object to read input
		Scanner input=new Scanner(System.in);


//prompt the user to enter the Five-digit number 
		System.out.print("Enter a five-digit number:");
		int fiveDigitNumber=input.nextInt();
		
		int no1=fiveDigitNumber/10000;
		int no2=(fiveDigitNumber/1000)%10;
		int no3=(fiveDigitNumber/100)%10;
		int no4=(fiveDigitNumber/10)%10;
		int no5=fiveDigitNumber%10;
		
		System.out.println( no1 + " " + no2 + " " + no3 + " " + no4 + " " + no5 + " ");
    }
}