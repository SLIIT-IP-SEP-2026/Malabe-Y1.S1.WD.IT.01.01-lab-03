import java.util.Scanner;

public class IT26102024Lab3Q1B{

    public static void main(String[]args){

        double price, kilograms, total, discount, finalAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = input.nextDouble();

        //Total bill before the discount
        total = price * kilograms;

        //The supermarket gives a 10% discount on the total bill
        discount = (total * 10) / 100;
        finalAmount = total - discount;

        System.out.println();
        System.out.println("The total amount with 10% discount is: "+finalAmount);
    }
}