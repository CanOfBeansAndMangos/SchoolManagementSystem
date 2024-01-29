import java.util.ArrayList;

public class Student extends Person
{
    int studID;
    ArrayList<Integer> grades = new ArrayList<>();
    int count;
    public ArrayList<String> courses = new ArrayList<>();

    public Student(int age, String name, String address, int ID, ArrayList<Integer> studentGrades)
    {
        super(name, age, address);
        studID = ID;
        grades = studentGrades;
    }

    public int calculateAverage()
    {
        for (int grade : grades)
        {
            count += grade;
        }

        count /= grades.length;
        return count;
    }

    public void enrollInCourse(String courseName)
    {
        courses.add(courseName);
    }
}