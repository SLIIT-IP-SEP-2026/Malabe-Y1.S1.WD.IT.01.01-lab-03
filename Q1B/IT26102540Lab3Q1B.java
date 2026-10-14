import java.util.Scanner;

public class IT26102540Lab3Q1B {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);

  
        System.out.print("Enter the price of 1kg of rice: ");
        double PricePerKg = price.nextDouble();

 
        System.out.print("Enter the number of kilograms you want to buy: ");
        double Kilo = price.nextDouble();

 
        double Total = PricePerKg * Kilo;

       
        double DiscountedTotal = Total * 0.90;
        
		System.out.print("The total amount with 10% discount is: " + DiscountedTotal);

        price.close();
    }
}