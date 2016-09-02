import javax.swing.*;

public class PayrollWithGUI {
    public static  void main(String []args){

        String employeeName = JOptionPane.showInputDialog(null,"Enter employee's name: ");
//        JOptionPane.showMessageDialog(null,"Enter employee's name: "+employeeName);

        String workHour = JOptionPane.showInputDialog(null,"Enter number of hours worked in a week: ");
//        JOptionPane.showMessageDialog(null,"Enter number of hours worked in a week: "+workHour);

        String hourlyPayRate = JOptionPane.showInputDialog(null,"Enter hourly pay rate: ");
//        JOptionPane.showMessageDialog(null,"Enter hourly pay rate: "+hourlyPayRate);

        String federalTax = JOptionPane.showInputDialog(null,"Enter faderal tax withholding rate: ");
//        JOptionPane.showMessageDialog(null,"Enter faderal tax withholding rate: "+federalTax);

        String stateTax = JOptionPane.showInputDialog(null,"Enter state tax withholding rate: ");
//        JOptionPane.showMessageDialog(null,"Enter state tax withholding rate: "+stateTax);

        double grossPay = Double.parseDouble(hourlyPayRate)  * Double.parseDouble( workHour);
        double federalWithholding = grossPay * Double.parseDouble(federalTax);
        double StateWithholding = grossPay * Double.parseDouble(stateTax);
        double totalDeduction = federalWithholding+StateWithholding;
        double netPay = grossPay-totalDeduction;

        JOptionPane.showMessageDialog(null,"Employee Name: " + employeeName);
        JOptionPane.showMessageDialog(null,"Hours Worked: " + Double.parseDouble(workHour));
        JOptionPane.showMessageDialog(null,"Pay rate:  $" + Double.parseDouble(hourlyPayRate));
        JOptionPane.showMessageDialog(null,"Gross rate:  $" + grossPay);
        JOptionPane.showMessageDialog(null,"Deductions:");
        JOptionPane.showMessageDialog(null,"Federal Withholding(" + Double.parseDouble(federalTax)*100 + "%):  $" +  federalWithholding);
        JOptionPane.showMessageDialog(null,"State Withholding(" + Double.parseDouble(stateTax)*100 + "%):  $" +  StateWithholding);
        JOptionPane.showMessageDialog(null,"Total Deduction:  $" + totalDeduction);
        JOptionPane.showMessageDialog(null,"Net Pay:  $" + netPay);


    }
}
