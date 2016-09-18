import java.util.ArrayList;
public class Course {

    private String courseName;
    ArrayList<String> students = new ArrayList<>();
    
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }

    public void addStudents(String student){
        students.add(student);
    }
    public ArrayList<String> getStudents() {
        return students;
    }
    public void dropStudent(String student) {
        students.remove(student);

    }

    public void clear(){
        students.clear();
    }

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudents("Peter Jones");
        course1.addStudents("Brian Smith");
        course1.addStudents("Anne Kennedy");

        course2.addStudents("Peter Jones");
        course2.addStudents("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents()+"and they are:");

        ArrayList<String> students1 = course1.getStudents();
        System.out.println(course1.students + ", ");

        System.out.println("Number of students in course2: "
                + course2.getNumberOfStudents()+"and they are:");

        ArrayList<String> students2 = course2.getStudents();
        System.out.println(course1.students + ", ");

        (course1.students).clear();
        (course2.students).clear();
        System.out.println("清除courses1，course2 中的学生后两门课程中人数为"+
                course1.getNumberOfStudents()+"、"+
                course2.getNumberOfStudents()+".");
    }
}


