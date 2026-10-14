import java.util.Scanner;

public class IT26102638_Lab3Q4
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        int number, digit1, digit2, digit3, digit4, digit5;

        System.out.println("Enter a 5 digit number");
        number = input.nextInt(); // receives user input of 5 digit number

        digit1 = number / 10000;
        digit2 = (number % 10000) / 1000;
        digit3 = (number % 1000) / 100;
        digit4 = (number % 100) / 10;
        digit5 = (number % 10);

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 );
    }
}