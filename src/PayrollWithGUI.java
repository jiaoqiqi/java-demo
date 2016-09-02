import javax.swing.*;

public class PayrollWithGUI {
    public static  void main(String []args){

        String employeeName = JOptionPane.showInputDialog(null,"Enter employee's name: ");
        String workHour = JOptionPane.showInputDialog(null,"Enter number of hours worked in a week: ");
        String hourlyPayRate = JOptionPane.showInputDialog(null,"Enter hourly pay rate: ");
        String federalTax = JOptionPane.showInputDialog(null,"Enter federal tax withholding rate: ");
        String stateTax = JOptionPane.showInputDialog(null,"Enter state tax withholding rate: ");

        double grossPay = Double.parseDouble(hourlyPayRate)  * Double.parseDouble( workHour);
        double federalWithholding = grossPay * Double.parseDouble(federalTax);
        double StateWithholding = grossPay * Double.parseDouble(stateTax);
        double totalDeduction = federalWithholding+StateWithholding;
        double netPay = grossPay-totalDeduction;

        JOptionPane.showMessageDialog(null,"Employee Name: " + employeeName+"\n" +
                "Hours Worked: " + Double.parseDouble(workHour)+"\n" +
                "Pay rate:  $" + Double.parseDouble(hourlyPayRate)+"\n" +
                "Gross rate:  $" + grossPay + "\n" +
                "Deductions:" + "\n" +
                "Federal Withholding(" + Double.parseDouble(federalTax)*100 + "%):  $" +  federalWithholding + "\n" +
                "State Withholding(" + Double.parseDouble(stateTax)*100 + "%):  $" +  StateWithholding + "\n" +
                "Total Deduction:  $" + totalDeduction + "\n" +
                "Net Pay:  $" + netPay);

    }
}
