public class Person {

    private String Name;

    private String Tel;

    private String Add;

    public Person(String Name, String Tel, String Add) {

        super();

        this.Name = Name;

        this.Tel = Tel;

        this.Add = Add;

    }

    public String getName() {

        return Name;

    }

    public String getTel() {

        return Tel;

    }

    public String getAdd() {

        return Tel;

    }

    public String toString() {

        return "姓名：" + Name + "，地址：" + Add + "，电话：" + Tel + ",class:Person";

    }

}

class Student extends Person {

    private int studentGrade;

    public Student(String Name, String Tel, String Add, int student_Grade) {

        super(Name, Tel, Add);

        this.studentGrade = student_Grade;

    }

    public int getStudentGrade() {

        return studentGrade;

    }

    public String toString() {

        return super.toString() + ",年级：" + studentGrade + ",class:Student";

    }

}

class People extends Person {

    private String Office;

    private double Salary;

    public People(String Name, String Tel, String Add, String Office, double Salary) {

        super(Name, Tel, Add);

        this.Office = Office;

        this.Salary = Salary;

    }

    public String getOffice() {

        return Office;

    }

    public double getSalary() {

        return Salary;

    }

    public String toString() {

        return super.toString() + ",办公室：" + Office + "，工资:" + Salary + ",class:People";

    }

}

class Faculty extends People {

    private String Level;

    public Faculty(String Name, String Tel, String Add, String Office, double Salary, String Level) {


        super(Name, Tel, Add, Office, Salary);

        this.Level = Level;

    }

    public String getLevel() {

        return Level;

    }

    public String toString() {

        return super.toString() + ",教员级别：" + Level + ",class:Faculty";

    }

}

class Staff extends People {

    private String Post;

    public Staff(String Name, String Tel, String Add, String Office, double Salary, String Post) {


        super(Name, Tel, Add, Office, Salary);

        this.Post = Post;

    }

    public String getPost() {

        return Post;

    }

    public String toString() {

        return super.toString() + ",职务称号：" + Post + ",class:Staff";

    }

}

class Person_Text {
    public static void main(String[] args) {

        Person zhangsan = new Person("张三", "110", "公安局");

        Person lisi = new Student("李四", "11111111", "城建", 1);

        Person wangwu = new People("王五", "1689756666", "城建", "计算机系 302", 2500.00);

        People zhaoliu = new Faculty("赵六", "10086", "城建", "计算机系203", 2700.00, "副教授");

        People liuqi = new Staff("刘七", "10010", "城建", "计算机系505", 4500.00, "副书记");
        System.out.println(zhangsan.toString());

        System.out.println(lisi.toString());

        System.out.println(wangwu.toString());

        System.out.println(zhaoliu.toString());

        System.out.println(liuqi.toString());

    }

}