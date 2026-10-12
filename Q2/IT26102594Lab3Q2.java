import java.util.Scanner;

public class IT26102594Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter monthly salary:");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter number of OT hours: ");
        int OThours = input.nextInt();

        System.out.print("Enter the OT hourly rate: ");
        double OTRate = input.nextDouble();

        double otAmount = OThours * OTRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("Net total salary including OT: " + totalSalary);
    }
}