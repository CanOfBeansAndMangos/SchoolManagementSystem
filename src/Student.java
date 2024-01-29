import java.util.ArrayList;
 
public class Student extends Person 
{
    int studID; 
    int[] grades; 
    int count; 
    public ArrayList<String> courses = new ArrayList<>();
  
    public Student(int age1, String name1, String add1, int ID, int[]d studentGrades)
    {
        super(age1,name1,add1);
        studID = ID; 
        grades = studentGrades; 
    }
  
    public int calculateAverage()
    {
        for (int i = 0; i < grades.length; i++)
        {
            count += grades[i];
        }
        count /= grades.length;
        return count; 
    }
  
    public void enrollInCourse(String courseName)
    {
      courses.add(courseName);
    }
}
