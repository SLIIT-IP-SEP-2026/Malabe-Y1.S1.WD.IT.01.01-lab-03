import java.util.Scanner;

public class IT26100052Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;
        double discount = total * 10 / 100;
        double amount = total - discount;

        System.out.println("\nThe total amount with 10% discount is: " + amount);

        input.close();
    }
}
