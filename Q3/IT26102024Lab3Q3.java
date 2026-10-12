import java.util.Scanner;

public class IT26102024Lab3Q3{

    public static void main(String[]args){

        int amount, balance;
        int n5000, n1000, n500, n200, n100, n50, n20, n10, n5, n2, n1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        amount = input.nextInt();

        //The balance keeps the money that is still left to break down
        balance = amount;

        //Division gives the number of notes, the remainder is carried forward
        n5000 = balance / 5000;
        balance = balance % 5000;

        n1000 = balance / 1000;
        balance = balance % 1000;

        n500 = balance / 500;
        balance = balance % 500;

        n200 = balance / 200;
        balance = balance % 200;

        n100 = balance / 100;
        balance = balance % 100;

        n50 = balance / 50;
        balance = balance % 50;

        n20 = balance / 20;
        balance = balance % 20;

        n10 = balance / 10;
        balance = balance % 10;

        n5 = balance / 5;
        balance = balance % 5;

        n2 = balance / 2;
        balance = balance % 2;

        //Whatever is left over is the number of 1 rupee pieces
        n1 = balance;

        System.out.println();
        System.out.println("5000 Notes - "+n5000);
        System.out.println("1000 Notes - "+n1000);
        System.out.println("500 Notes - "+n500);
        System.out.println("200 Notes - "+n200);
        System.out.println("100 Notes - "+n100);
        System.out.println("50 Notes - "+n50);
        System.out.println("20 Notes - "+n20);
        System.out.println("10 Notes - "+n10);
        System.out.println("05 Notes - "+n5);
        System.out.println("02 Notes - "+n2);
        System.out.println("01 Notes - "+n1);
    }
}