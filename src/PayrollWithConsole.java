import java.util.Scanner;

public class PayrollWithConsole {
    public static  void main(String []args){

        System.out.print("Enter employee's name: ");
        Scanner input1 = new Scanner(System.in);
        String employeeName = input1.next();

        System.out.print("Enter number of hours worked in a week: ");
        Scanner input2  = new Scanner(System.in);
        int workHour = input2.nextInt();

        System.out.print("Enter hourly pay rate: ");
        Scanner input3  = new Scanner(System.in);
        double hourlyPayRate = input3.nextDouble();

        System.out.print("Enter faderal tax withholding rate: ");
        Scanner input4  = new Scanner(System.in);
        double federalTax = input4.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        Scanner input5  = new Scanner(System.in);
        double stateTax = input5.nextDouble();

        double grossPay = hourlyPayRate  *  workHour;
        double federalWithholding = grossPay * federalTax;
        double StateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding+StateWithholding;
        double netPay = grossPay-totalDeduction;


        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + workHour);
        System.out.println("Pay rate:  $" + hourlyPayRate);
        System.out.println("Gross rate:  $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding(" + federalTax*100 + "%):  $" +  federalWithholding);
        System.out.println("  State Withholding(" + stateTax*100 + "%):  $" +  StateWithholding);
        System.out.println("  Total Deduction:  $" + totalDeduction);
        System.out.println("Net Pay:  $" + netPay);
    }
}
