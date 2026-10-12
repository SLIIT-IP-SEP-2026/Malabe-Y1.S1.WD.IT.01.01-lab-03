import java.util.Scanner;

public class IT26102024Lab3Q1A{

    public static void main(String[]args){

        double price, kilograms, total;

        Scanner input = new Scanner(System.in);

        //Getting the price and the quantity from the user
        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = input.nextDouble();

        //Calculating the amount to pay
        total = price * kilograms;

        System.out.println();
        System.out.println("The total amount is: "+total);
    }
}