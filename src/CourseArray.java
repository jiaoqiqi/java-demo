import java.util.ArrayList;
public class CourseArray {

    private String courseName;
    private ArrayList students = new ArrayList(100);
    private int numberOfStudents;

    public CourseArray(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(numberOfStudents, student);
        numberOfStudents++;
    }

    public ArrayList getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;
    }

}

class CourseTest {

    public static void main(String[] args) {
        CourseArray course = new CourseArray("Java");
        for (int i = 1; i <= 10; ++i) {
            course.addStudent(String.format("Student%d", i));
        }
        System.out.println("Step 1:We initialized 10 students into the ArrayList.");
        System.out.println("Course Name: " + course.getCourseName() + "\nNumber of students: " + course.getNumberOfStudents() + "\nStudents List: " + course.getStudents());
        for (int i = 1; i<= 5; ++i) {
            course.dropStudent(String.format("Student%d",i));
        }
        System.out.println("\nStep 2:We removed 5 students from the ArrayList.");
        System.out.println("Course Name: " + course.getCourseName() + "\nNumber of students: " + course.getNumberOfStudents() + "\nStudents List: " + course.getStudents());
    }
}