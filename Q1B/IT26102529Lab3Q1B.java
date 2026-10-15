import java.util.Scanner;

public class IT26102529Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        int price = input.nextInt();

        System.out.print("Enter the number of kilograms you want to buy: ");
        int kilograms = input.nextInt();

        double total = price * kilograms;
        double discount = total * 10/100;
        double finalAmount = total - discount;

        System.out.println("The total amount: " + finalAmount);
    }
}