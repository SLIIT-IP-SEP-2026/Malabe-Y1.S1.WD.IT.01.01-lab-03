import java.util.Scanner;
public class IT26102407Lab3Q3 {
	
	public static void main(String[]args){
		
		//Creating scanner
		Scanner sc = new Scanner(System.in);
		
		//Creating variables
		int Notes5000 = 0;
		int Notes1000 = 0;
		int Notes500  = 0;
		int Notes200  = 0;
		int Notes100  = 0;
		int Notes50   = 0;
		int Notes20   = 0;
		int Notes10   = 0;
		int Notes5    = 0;
		int Notes2    = 0;
		int Notes1    = 0;
		
		
		//Getting the amount as a input
		System.out.print("Enter the Rupee amount: ");
		int Amount = sc.nextInt();
		
		
		//Checking how much notes have and produce remainder
		Notes5000 = Amount/5000;
		Amount = Amount % 5000;
		
		Notes1000 = Amount/1000;
		Amount = Amount % 1000;
		
		Notes500 = Amount/500;
		Amount = Amount % 500;
		
		Notes200 = Amount/200;
		Amount = Amount % 200;
		
		Notes100 = Amount/100;
		Amount = Amount % 100;
		
		Notes50 = Amount/50;
		Amount = Amount % 50;
		
		Notes20 = Amount/20;
		Amount = Amount % 20;
		
		Notes10 = Amount/10;
		Amount = Amount % 10;
		
		Notes5 = Amount/5;
		Amount = Amount % 5;
		
		Notes2 = Amount/2;
		Amount = Amount % 2;
		
		Notes1 = Amount/1;
		Amount = Amount % 1;
		
		
		//Display the output
		System.out.println ("5000 Notes- "+Notes5000);
		System.out.println ("1000 Notes- "+Notes1000);
		System.out.println ("500 Notes- "+Notes500);
		System.out.println ("100 Notes- "+Notes100);
		System.out.println ("50 Notes- "+Notes50); 
		System.out.println ("20 Notes- "+Notes20);
		System.out.println ("10 Notes- "+Notes10);
		System.out.println ("05 Notes- "+Notes5);
		System.out.println ("02 Notes- "+Notes2);
		System.out.println ("01 Notes- "+Notes1);
		
	}
	
}