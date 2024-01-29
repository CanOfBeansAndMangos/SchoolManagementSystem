public class Staff extends Person
{
    private final int staffEmployeeId;
    private String staffDepartment;
    public Staff(String name, int age, String address, String department, int employeeId)
    {
        super(name, age, address);
        staffDepartment = department;
        staffEmployeeId = employeeId;
    }


    public void ChangeDepartment(String newDepartment)
    {
        staffDepartment = newDepartment;
    }

    public int GetEmployeeId()
    {
        return staffEmployeeId;
    }

    @Override
    public String displayInfo()
    {
        return super.displayInfo() + ". This person is a staff who works at " + staffDepartment + ", and has employee id #" + staffEmployeeId;
    }
}
