import javax.security.auth.Subject;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teacher extends Person
{
    ArrayList<String> subjects = new ArrayList<>();
    public Teacher(String name, int age, String address, String subject)
    {
        super(name, age, address);
        subjects.add(subject);
    }
    public void addSubject(String subjectToAdd)
    {
        subjects.add(subjectToAdd);
    }
    public void removeSubject(String subjectToRemove)
    {
        subjects.remove(subjectToRemove);
    }

}
