package Task2;

public class Course {
    private String courseName;
    private double courseGrade;

    public Course(String courseName, double courseGarde) {
        this.courseName = courseName;
        this.courseGrade = courseGarde;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseGarde=" + courseGrade +
                '}';
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseGarde() {
        return courseGrade;
    }

    public void setCourseGarde(double courseGarde) {
        this.courseGrade = courseGarde;
    }
}
