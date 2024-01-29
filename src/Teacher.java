import java.util.ArrayList;

public class Teacher extends Staff
{
    ArrayList<String> subjectsTaught = new ArrayList<>();
    public Teacher(String name, int age, String address, String subjectTaught, String department, int employeeID)
    {
        super(name, age, address, department, employeeID);
        subjectsTaught.add(subjectTaught);
        super.GetEmployeeId();
    }
    public void addSubject(String subjectToAdd)
    {
        subjectsTaught.add(subjectToAdd);
    }
    public void removeSubject(String subjectToRemove)
    {
        subjectsTaught.remove(subjectToRemove);
    }

}
