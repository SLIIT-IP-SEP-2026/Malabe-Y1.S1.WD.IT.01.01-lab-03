import java.util.Scanner;

public class IT26102024Lab3Q2{

    public static void main(String[]args){

        double monthlySalary, otHours, otRate, otAmount, totalSalary;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        otRate = input.nextDouble();

        //OT Amount = OT hours * OT hourly rate
        otAmount = otHours * otRate;

        //Total Salary = Monthly salary + OT amount
        totalSalary = monthlySalary + otAmount;

        System.out.println();
        System.out.println("The total salary including OT is: "+totalSalary);
    }
}