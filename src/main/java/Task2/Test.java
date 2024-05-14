package Task2;
import com.google.gson.*;
import org.json.JSONArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Test {
    public static ArrayList<Student> readAndConvert(String pathToJsonFile)  throws IOException {
        Path path = Path.of(pathToJsonFile);
        if (!Files.exists(path))
        {
            throw new FileNotFoundException();
        }

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        String jsonContent = Files.readString(path);
        JSONArray jsonArray = new JSONArray(jsonContent);

        ArrayList<Student> students = new ArrayList<>();
        for (Object jsonObject : jsonArray)
        {
            Student student = gson.fromJson(String.valueOf(jsonObject), Student.class);
            students.add(student);
        }
        return students;
    }

    public static HashMap<Student, Double> theHighestAvGr(HashMap<Student
            , Double> averageGrades)
    {
        double max = 0.0;
        Student student = null;
        for (Student st : averageGrades.keySet())
        {
            if (averageGrades.get(st) > max)
            {
                max = averageGrades.get(st);
                student = st;
            }
        }
        HashMap<Student, Double> studWithHigAvGr = new HashMap<>();
        studWithHigAvGr.put(student, max);
        return studWithHigAvGr;
    }
    public static HashMap<Student, Double> averageGrade(ArrayList<Student> list)
    {
        HashMap<Student, Double> mapWithAvGr = new HashMap<>();
        for (Student st : list)
        {
            OptionalDouble optional = st.getCourses().stream()
                    .mapToDouble(Course::getCourseGarde).average();

            double average = optional.isPresent() ? optional.getAsDouble() : null;

            mapWithAvGr.put(st, average);
        }
        return mapWithAvGr;
    }
    public static void main(String[] args) throws IOException {

        ArrayList<Student> students =
                readAndConvert("src/main/resources/students.json");
        //students.forEach(System.out::println);

        System.out.println("List with average Grades: ");
        HashMap<Student, Double> averageGrades = averageGrade(students);
        for (Student st : averageGrades.keySet())
        {
            System.out.println("Student: " + st.getName() +
                    " Average Grade: " + averageGrades.get(st));
        }


        HashMap<Student, Double> studentWithHighestAvGr
                = theHighestAvGr(averageGrades);
        String student = null;
        Double average = null;
        for (Student st : studentWithHighestAvGr.keySet())
        {
            student = st.getName();
            average = studentWithHighestAvGr.get(st);
        }
        System.out.println("Student with the highest average grade is "
                + student + ", Average Grade : " + average);
    }
}
