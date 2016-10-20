import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class TestLoan {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Object> list = new ArrayList();
        System.out.println("请输入贷款金额====");
        Loan loan = new Loan(in.nextDouble());
        list.add(loan);
        System.out.println("请输入时间字符串====");
        Mydate mydate = new Mydate(in.next());
        list.add(mydate);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
//Loan类
public class Loan {
    private Double loan;

    public Loan (Double loan){//构造方法赋值 也可以使用set 方法
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "Loan:"+loan;
    }
}
//Mydate 类
class Mydate {
    private String date;
    public Mydate(String date){
        this.date = date;
    }
    @Override
    public String toString() {
        return "Date:"+date;
    }
}