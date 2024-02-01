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
        System.out.println("What type of school person would you like to add to the school?");
        System.out.println("1. Student");
        System.out.println("2. Teacher");
        System.out.println("3. Staff Member");
        int choice = scanner.nextInt();
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
        else
        {
            System.out.println("Please choose a valid input (1-3)!");
            AddPersonMenu();
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

        System.out.println("What is their student ID?");
        int ID = scanner.nextInt();

        System.out.println("What are the classes the student is enrolled in?");
        System.out.println("(Type \"quit\" to stop adding subjcts)");
        ArrayList<String> studentClasses = new ArrayList<>();
        while(true)
        {
            String aSubjectTheStudentIsLearning = scanner.next();
            if(aSubjectTheStudentIsLearning == "quit")
            {
                break;
            }
            else studentClasses.add(aSubjectTheStudentIsLearning);
        }

        ArrayList<Integer> grades = new ArrayList<>();
        for(int i = 0; i < studentClasses.size(); i++)
        {
            System.out.println("Grade for " + studentClasses.get(i));
            int gradeForThisClass = scanner.nextInt();

            grades.add(gradeForThisClass);
        }
        studentList.add(new Student(age, name, address, ID, grades, studentClasses));

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

        System.out.println("What is their employee id?");
        int employeeId = scanner.nextInt();

        System.out.println("What are the subjects they teach?");
        System.out.println("(Type \"quit\" to stop adding classes)");
        ArrayList<String> taughtClasses = new ArrayList<>();
        while(true)
        {
            String aClassTheTeacherTeaches = scanner.next();
            if(aClassTheTeacherTeaches == "quit")
            {
                break;
            }
            else taughtClasses.add(aClassTheTeacherTeaches);
        }
        
        teacherList.add(new Teacher(name, age, address, taughtClasses, "Teacher", employeeId));
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
