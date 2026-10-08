 import java.util.Scanner;
 
 public class IT26102461Lab3Q1B{
 public static void main(String[]args){
	 Scanner input=new Scanner(System.in);
	 
	 System.out.print("Enter the price of 1kg of rice: ");
	 double price=input.nextDouble();
	 
	 System.out.print("enter the number of kilograms you want to buy: ");  
      
     int kg=input.nextInt();

     double total=price*kg;
     double discount=total*0.10;
     double finalamount=total-discount;

     System.out.println("The totalamount with 10% discount is; " + finalamount);

        input.close();
 }
 } 
