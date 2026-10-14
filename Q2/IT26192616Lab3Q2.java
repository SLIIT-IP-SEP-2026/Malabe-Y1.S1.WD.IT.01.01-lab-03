import java.util.Scanner;

public class IT26192616Lab3Q2 {
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
		
        double salary = scanner.nextDouble();
        System.out.print("Enter the number of OT hours: ");
		
        double otHours = scanner.nextDouble();
        System.out.print("Enter the OT hourly rate: ");
		
        double otRate = scanner.nextDouble();
        double totalSalary = salary + (otHours * otRate);
		
        System.out.println("The total salary including OT is: " + totalSalary);
		
    }
}