import java.util.Scanner;

public class IT26102638_Lab3Q3
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        int amount, count, remaining;
        System.out.println("Enter your rupee amount: ");
        amount = input.nextInt();

        if(amount < 0){
            System.out.println("Enter a valid amount"); 
        } // validates that user input is above 0

        remaining = amount;

        // for 5000 notes
        count = remaining/5000;
        remaining %= 5000; 
        if(count > 0){
            System.out.println("5000 notes : " + count);
        }else {
            System.out.println("5000 notes:  0");
        }

        // for 1000 notes
        count = remaining / 1000;
        remaining = remaining % 1000;
         if(count > 0){
            System.out.println("1000 notes : " + count);
        }else {
            System.out.println("5000 notes:  0");
        }

        // for 500 notes
        count = remaining / 500;
        remaining = remaining % 500;
         if(count > 0){
            System.out.println("500 notes : " + count);
        }else {
            System.out.println("5000 notes:  0");
        }

        //for 200 notes
        count = remaining / 200;
        remaining = remaining % 200;
         if(count > 0){
            System.out.println("200 notes : " + count);
        }else {
            System.out.println("200 notes:  0");
        }

        //for 100 notes 
         count = remaining / 100;
        remaining = remaining % 100;
         if(count > 0){
            System.out.println("100 notes : " + count);
        } else {
            System.out.println("100 notes:  0");
        }

        //for 50 notes
         count = remaining / 50;
        remaining = remaining % 50;
         if(count > 0){
            System.out.println("50 notes : " + count);
        }else {
            System.out.println("50 notes:  0");
        }

        //for 20 notes
         count = remaining / 20;
        remaining = remaining % 20;
         if(count > 0){
            System.out.println("20 notes : " + count);
        }else {
            System.out.println("20 notes:  0");
        }

        //for 10 coins 
         count = remaining / 10;
        remaining = remaining % 10;
         if(count > 0){
            System.out.println("10 coins : " + count);
        }else {
            System.out.println("10 coins:  0");
        }

        //for 05 coins
         count = remaining / 05;
        remaining = remaining % 05;
         if(count > 0){
            System.out.println("05 coins : " + count);
        }else {
            System.out.println("05 coins:  0");
        }

        //for 02 coins
         count = remaining / 02;
        remaining = remaining % 02;
         if(count > 0){
            System.out.println("02 coins : " + count);
        }else {
            System.out.println("02 coins:  0");
        }

        //for 01 coins
         count = remaining / 01;
        remaining = remaining % 01;
         if(count > 0){
            System.out.println("01 coins : " + count);
        }else {
            System.out.println("01 coins:  0");
        }
    }
}