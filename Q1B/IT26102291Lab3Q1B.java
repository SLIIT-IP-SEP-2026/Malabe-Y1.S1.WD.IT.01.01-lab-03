import java.util.Scanner;

public class IT26102291Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double price = scanner.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = scanner.nextDouble();
        
        double total = price * kg;
        double discountAmount = total * 0.10;
        double finalAmount = total - discountAmount;
        
        System.out.println("The total amount with 10% discount is: " + finalAmount);
        

    }
}