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

    public void changeDepartment(String newDepartment)
    {
        staffDepartment = newDepartment;
    }

    public int getEmployeeId()
    {
        return staffEmployeeId;
    }

    @Override
    public String toString()
    {
        return super.toString() + ". This person is a staff who works at " + staffDepartment + ", and has employee id #" + staffEmployeeId;
    }
}
