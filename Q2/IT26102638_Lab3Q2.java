import java.util.Scanner;
public class IT26102638_Lab3Q2
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        double monthly_s ,OT_hours, OT_rate, OT_amount, Total_salary;

        System.out.println("Enter monthly salary: ");
        monthly_s = input.nextDouble();

        System.out.println("Enter number of OT hours: ");
        OT_hours = input.nextDouble();

        System.out.println("Enter OT rate: ");
        OT_rate = input.nextDouble();

        OT_amount = OT_hours * OT_rate;
        Total_salary = monthly_s + OT_amount;

        System.out.println("The total salary including OT is:" + Total_salary);
    }
}