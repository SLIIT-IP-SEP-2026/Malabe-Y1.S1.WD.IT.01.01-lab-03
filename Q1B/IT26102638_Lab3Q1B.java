import java.util.Scanner;
public class IT26102638_Lab3Q1B
{   
    
    public static void main(String [] args)
    {
        
        double Total, riceprice, ricekilo, discount, price,Total_discount;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");
        riceprice = input.nextInt();  // gets price of rice per kilo

        System.out.println("How many kilos of rice? ");
        ricekilo = input.nextInt(); // gets amount of kilos

        discount = 0.1;

        price = riceprice * ricekilo; // finds total price
        
        Total_discount = price * discount; // calculates discount

        Total = price - Total_discount; // finds price after discount
        

        System.out.println("Total amount with 10 % discount is: "+ Total); 

    }
}
