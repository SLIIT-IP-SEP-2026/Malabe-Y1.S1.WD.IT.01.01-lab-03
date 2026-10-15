import java.util.Scanner;

public class IT26102396Lab3Q1B {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

   
        System.out.print("Enter the price 1kg of rice: ");
        double priceofkilo  = input.nextDouble();

        System.out.print("Enter the number of kilograms you want: ");
        int totalkilos = input.nextInt();

        double totalPrice = priceofkilo * totalkilos;

        double discountPrice  = totalPrice - (totalPrice * 10.0/100);

        System.out.println("Total price of the rice is : RS." + discountPrice );

        
    }
}
