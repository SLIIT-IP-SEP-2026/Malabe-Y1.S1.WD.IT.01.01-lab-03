import java.util.Scanner; // Import scanner class for inputs
public class IT26102638_Lab3Q1A
{   
    
    public static void main(String [] args)
    {
        
        double Total, riceprice, ricekilo;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of 1kg of rice: ");
        riceprice = input.nextInt();  // gets price of rice per kilo

        System.out.println("How many kilos of rice? ");
        ricekilo = input.nextInt(); // gets amount of kilos

        Total = riceprice * ricekilo; // finds total price

        System.out.println("Total amount is: "+ Total); 

    }
}