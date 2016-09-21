import java.util.Scanner;

public class sortStudents {
    private String name;
    private long grade;

    public long getGrade() {
        return grade;
    }
    public void setGrade(long grade) {
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生数");
        int stuNum = input.nextInt();
        sortStudents objArr[] = new sortStudents[stuNum];
        for(int i = 0; i < objArr.length; i++){
            objArr[i] = new sortStudents();
            System.out.println("请输入第" + (i+1) + "个学生的姓名");
            String name = input.next();
            objArr[i].setName(name);
            System.out.println("请输入第" + (i+1) + "个学生的成绩");
            long grade = input.nextLong();
            objArr[i].setGrade(grade);
        }
        System.out.println("降序打印学生名单为： ");
        for(int i = 0; i < objArr.length; i++){
            for(int j = i+1; j < objArr.length; j++){
                if(objArr[i].getGrade() < objArr[j].getGrade()){
                    sortStudents s = new sortStudents();
                    s = objArr[i];
                    objArr[i] = objArr[j];
                    objArr[j] = s;
                }
            }
        }
        for(int i=0; i < objArr.length; i++){
            System.out.println(objArr[i].getName());
        }
    }
}