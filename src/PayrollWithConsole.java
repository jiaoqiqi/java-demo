import java.util.Scanner;

public class PayrollWithConsole {
    public static  void main(String []args){

        System.out.print("Enter employee's name: ");
        Scanner input = new Scanner(System.in);
        String employeeName = input.next();

        System.out.print("Enter number of hours worked in a week: ");
        int workHour = input.nextInt();

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = hourlyPayRate  *  workHour;
        double federalWithholding = grossPay * federalTax;
        double StateWithholding = grossPay * stateTax;
        double totalDeduction = federalWithholding+StateWithholding;
        double netPay = grossPay-totalDeduction;


        System.out.println("Employee Name: " + employeeName + "\n" +
                "Hours Worked: " + workHour + "\n" +
                "Pay rate:  $" + hourlyPayRate + "\n" +
                "Gross rate:  $" + grossPay + "\n" +
                "Deductions:" + "\n" +
                "  Federal Withholding(" + federalTax*100 + "%):  $" +  federalWithholding + "\n" +
                "  State Withholding(" + stateTax*100 + "%):  $" +  StateWithholding + "\n" +
                "  Total Deduction:  $" + totalDeduction + "\n" +
                "Net Pay:  $" + netPay);

    }
}
