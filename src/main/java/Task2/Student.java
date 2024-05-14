package Task2;
import java.util.ArrayList;
public class Student {
    private ArrayList<Course> courses;
    private String major;
    private String name;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mayor='" + major + '\'' +
                ", courses=" + courses +
                '}';
    }

    public Student(ArrayList<Course> courses, String mayor, String name) {
        this.courses = courses;
        this.major = mayor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMayor() {
        return major;
    }

    public void setMayor(String mayor) {
        this.major = mayor;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
