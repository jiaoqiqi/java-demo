import java.util.Date;
public class Account {
    int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public void setId(int newId) {
        id = newId;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    public double getBalance(){return balance;}
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    public double getAnnualInterestRate(){return annualInterestRate; }

    public double getMonthInterestRate() {
        return (annualInterestRate / 12);
    }

    public double getWithdraw() {
        return (2500);
    }
    public double getDeposit() {
        return (3000);
    }
    public double getNewBalance() {
        return (balance - getWithdraw() + getDeposit());
    }
    public static void main(String []args) {
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);
        Date dateCreated = new Date();
        System.out.println(" The id is" + account.getId());
        System.out.println(" The balance is " + account.getNewBalance());
        System.out.println(" The rate is " + account.getMonthInterestRate()+"%");
        System.out.println(" The date is " + dateCreated.toString());

    }

}

