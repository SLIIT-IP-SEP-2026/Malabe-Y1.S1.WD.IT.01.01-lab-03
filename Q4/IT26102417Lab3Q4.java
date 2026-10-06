import java.util.Scanner;

public class IT26102417Lab3Q4{
        static void main(String[] args){
         
        Scanner input = new Scanner(System.in);

        int n1,n2,n3,n4,n5 ,number;
        		
		System.out.print("Enter the five digit number: ");
	    number = input.nextInt();
	
        n1 = number / 10000;
        number = number % 10000;	

        
        n2 = number / 1000;
        number = number % 1000;

        n3 = number / 100;
        number = number % 100;

        n4 = number / 10;
        number = number % 10;	

        n5 = number / 1;
        number = number % 1;

       System.out.print( n1 );
       System.out.print( " " + n2 );	  
       System.out.print( " "  +n3 );
	   System.out.print( " " +n4 );
	   System.out.print( " " +n5 );
        
	
	
	
	
	
	
     }
}		