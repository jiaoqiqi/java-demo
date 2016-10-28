import java.util.*;
public class IllegalArgumentException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public IllegalArgumentException(){
        this(2.5,1,1000);
    }

    public IllegalArgumentException(double annualInterestRate,int numberOfYears,double getLoanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){return annualInterestRate;}
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears (){return numberOfYears;}
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public  double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate/1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment()*numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate(){
        return loanDate;
    }


    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        double annualInterestRate = input.nextDouble();
        int numberOfYears = input.nextInt();
        double loanAmount = input.nextDouble();
        if(annualInterestRate<0 || numberOfYears<0 || loanAmount<0){
            throw new java.lang.IllegalArgumentException("Wrong Argument");
        }

    }
}
