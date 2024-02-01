import java.util.ArrayList;

public class Teacher extends Staff
{
    ArrayList<String> teacherSubjects = new ArrayList<>();
    public Teacher(String name, int age, String address, ArrayList<String> subjectsTaught, int employeeID)
    {
        // No reason for being able to manually set the department parameter as they are always a teacher
        super(name, age, address, "Teaching", employeeID);
        teacherSubjects = subjectsTaught;
    }

    public void addSubject(String subjectToAdd)
    {
        teacherSubjects.add(subjectToAdd);
    }
    public void removeSubject(String subjectToRemove)
    {
        teacherSubjects.remove(subjectToRemove);
    }

    @Override
    public String toString() 
    {
        return super.getName() + ". This person is a teacher who teaches the following subjects: " + teacherSubjects.toString();
    }
}
