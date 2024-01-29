import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Scanner;

public class School
{
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Student> studentList = new ArrayList<>();
    public ArrayList<Teacher> teacherList = new ArrayList<>();
    public ArrayList<Staff> staffList = new ArrayList<>();

    public void AddPersonMenu()
    {
        int choice = 0;


        System.out.println("What type of school person would you like to add to the school?");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.println("3. Staff Member");
        choice = scanner.nextInt();
        if(choice <= 3 && choice >= 1 )
        {
            switch(choice)
            {
                case 1:
                    CreateNewStudent();
                    break;
                case 2:
                    CreateNewTeacher();
                    break;
                case 3:
                    CreateNewStaff();
                    break;
            }
        }
    }

    private void CreateNewStudent()
    {
        System.out.println("What is their name?");
        String name = scanner.next();
        System.out.println("How Old Are They?");
        int age = scanner.nextInt();
        System.out.println("Where do they live?");
        String address = scanner.next();
        System.out.println("What is a subject that they are enrolled in?");
        String Subject = scanner.next();
        System.out.println("What is their grade in this subject?");

        int currentGradeInput = 0;
        ArrayList<Integer> grades = new ArrayList<>();
        while(true)
        {
            currentGradeInput = scanner.nextInt();

            if(currentGradeInput == -1)
            {
                break;
            }
            else
            {
                grades.add(currentGradeInput);
            }
        }

        System.out.println("What is their student ID?");
        int ID = scanner.nextInt();
        studentList.add(new Student(age, name, address, ID, grades));

    }
    private void CreateNewStaff()
    {
        System.out.println("What is their name?");
        String name = scanner.next();
        System.out.println("How Old Are They?");
        int age = scanner.nextInt();
        System.out.println("Where do they live?");
        String address = scanner.next();
        System.out.println("What department are they in?");
        String department = scanner.next();
        System.out.println("What is their employee ID?");
        int ID = scanner.nextInt();
        System.out.println("What age are they?");
        staffList.add(new Staff(name, age, address,department, ID));
    }
    private void CreateNewTeacher()
    {
        System.out.println("What is their name?");
        String name = scanner.next();
        System.out.println("How Old Are They?");
        int age = scanner.nextInt();
        System.out.println("Where do they live?");
        String address = scanner.next();
        System.out.println("What is a subject they teach?");
        String firstSubjectTaught = scanner.next();

        String department = "Teaching";
        System.out.println("What is their employee id?");
        int employeeId = scanner.nextInt();

        teacherList.add(new Teacher(name, age, address, firstSubjectTaught, department, employeeId));
    }

    public String DisplayStudents()
    {
        return studentList.toString();
    }

    public String DisplayStaff()
    {
        return staffList.toString();
    }

    public String DisplayTeachers()
    {
        return teacherList.toString();
    }
}
