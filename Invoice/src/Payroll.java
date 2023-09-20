import java.util.Scanner;

public class Payroll {
    public static final double PROF_TAX_RATE = 0.20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.println("Enter Designation: ");
        String designation = scanner.nextLine();

        System.out.println("Enter Days Worked: ");
        int daysWorked = scanner.nextInt();

        System.out.println("Enter Pay Rate: ");
        double payRate = scanner.nextDouble();

        // Calculate Basic Pay
        double basicPay = daysWorked * payRate;

        // Calculate P.F
        double pf = basicPay / 10;

        // Calculate PROF TAX
        double profTax = basicPay * PROF_TAX_RATE;

        double totalDeduct= pf + profTax;

        double netpay= basicPay - totalDeduct;


        System.out.println("Enter employee number to generate payslip: ");
        int employeeNumber = scanner.nextInt();
        
        System.out.println("SHREE KRISHNA CHEMISTS AND DRUGGIST");
        System.out.println("SALARY MONTH 9 2013");
        System.out.println("EMP.NO: " + employeeNumber);
        System.out.println("EMP.NAME: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("DAYS WORKED: " + daysWorked);
        System.out.println("Payrate: " + payRate);
        System.out.println("Date: 13-09-2023");
        System.out.println("________________________________________________________________________________________");
        System.out.printf("%-20s %-20s %-20s %-20s%n", "EARNINGS", "AMOUNT(R.S)", "DEDUCTIONS", "AMOUNT(R.S)");
        System.out.println("__________________________________________________________________________________________");
        System.out.printf("%-20s %-20.2f %20s %20.2f%n", "BASIC PAY:", basicPay, "P.F:", pf);
        System.out.printf("%20s %20.2f%n", "PROF TAX:", profTax);
        System.out.println("__________________________________________________________________________________________");
        System.out.printf("%-20s %-20.2f %-20s %-20.2f%n", "GROSS EARN:", basicPay, "TOTAL DEDUCT:", totalDeduct);
        System.out.printf( "%20s %20.2f%n", "NET PAY:", netpay);
        System.out.println("__________________________________________________________________________________________");

        scanner.close();
    }
}
