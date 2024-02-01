import java.util.ArrayList;

public class Teacher extends Staff
{
    ArrayList<String> teacherSubjects = new ArrayList<>();
    public Teacher(String name, int age, String address, ArrayList<String> subjectsTaught, String department, int employeeID)
    {
        super(name, age, address, department, employeeID);
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
        return super.getPersonName() + ", " + super.getPersonAge() + " is a teacher who teaches the following subjects: " + teacherSubjects.toString();
    }
}
