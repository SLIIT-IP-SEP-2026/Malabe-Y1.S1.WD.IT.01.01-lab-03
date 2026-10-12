import java.util.Scanner; 
public class IT26102502Lab3Q1A{
	public static void main(String[] args){
     	Scanner input = new Scanner(System.in);
		 
		//input the price of 1kg of rice ITxxxxxxxxLab3Q1A
		System.out.println("Enter the price: ");
		double price = input.nextDouble();
		 
		//input the amount of kilos customr want 
		System.out.println("Enter the amount of kilos: ");
		double kilos = input.nextDouble();
		
		//Calculating the total...
		double total = price * kilos;
		
		
		
		//Displaing the final amounts....		
		System.out.println("PRICE: " + price);
		System.out.println("KILOS: " + kilos);
		System.out.println("TOTAL: " + total);
		  
	}
}