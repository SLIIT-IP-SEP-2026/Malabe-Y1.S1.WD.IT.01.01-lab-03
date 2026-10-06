import java.util.Scanner;

public class IT26102417Lab3Q3{ 
   public static void main (String[]args){
   
   Scanner input = new Scanner(System.in);
   
   int amount;
   int note5k = 0 , note1k = 0 , note500 = 0 , note200 = 0, note100 = 0 ;
   int note50 = 0 , note20 = 0 , note10 = 0 , note5 = 0 , note2 = 0 , note1 = 0 ;
   
   System.out.print("Enter the rupee amount:");
   amount = input.nextInt();
 
 
 
   note5k = amount / 5000;
   amount =  amount % 5000;  
   
   note1k = amount / 1000;
   amount = amount % 1000;
    
	note500 = amount / 500;
   amount =  amount % 500;
   
   note200 = amount / 200;
   amount =  amount % 200 ;
   
   note100 = amount / 100;
   amount =  amount % 100 ; 
   
   note50 = amount / 50;
   amount =  amount % 50;  
   
   note20 = amount / 20;
   amount =  amount % 20;  
   
    note10 = amount / 10;
   amount =  amount % 10; 
   
    note5 = amount / 5;
   amount =  amount % 5;   
   
    note1 = amount / 1;
   amount =  amount % 1;  
   
   System.out.println("5k notes: =" + note5k);
   System.out.println("1k notes: =" + note1);
   System.out.println("500 notes: =" + note500);
   System.out.println("200 notes: =" + note200);
   System.out.println("100 notes: =" + note100);
   System.out.println("50 notes: =" + note50);
   System.out.println("20 notes: = " +note20);
   System.out.println("10 notes: =" + note10);
   System.out.println("5 notes: = " +note5);
   System.out.println("1 notes: = " +note1);



   }

}