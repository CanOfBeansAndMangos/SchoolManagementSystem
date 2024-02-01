import java.util.ArrayList;

public class Student extends Person
{
    int studID;
    ArrayList<Integer> grades = new ArrayList<>();
    public ArrayList<String> courses = new ArrayList<>();

    public Student(int age, String name, String address, int ID, ArrayList<Integer> studentGrades, ArrayList<String> enrolledClasses)
    {
        super(name, age, address);
        studID = ID;
        grades = studentGrades;
    }

    public float calculateAverage()
    {
        float averagedGrades = 0;   // I need to learn why i have to initialise these variables, since it doesn't happen in C#
        for (int grade : grades)
        {
            averagedGrades += grade;
        }

        averagedGrades /= grades.size();
        return averagedGrades;
    }

    public void enrollInCourse(String courseName)
    {
        courses.add(courseName);
    }

    public void dropCourse(String courseToDrop)
    {
        for(int i = 0; i < courses.size(); i++)
        {
            if(courses.get(i) == courseToDrop)
            {
                courses.remove(i);
                break;
            }
        }
    }
}