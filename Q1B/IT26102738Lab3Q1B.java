import java.util.Scanner;

public class IT26102738Lab3Q1B {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of Rice: ");
        double PricePerKg = price.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double Kilo = price.nextDouble();

        double DiscountedTotal =(PricePerKg * Kilo)*0.90;
		
		System.out.println("The total Amount with 10% discount is: " + DiscountedTotal);
	}
}	