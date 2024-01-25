public class Person
{
    private String personName;
    private int personAge;
    private String personAddress;

    public Person(String name, int age, String address)
    {
        personName = name;
        personAge = age;
        personAddress = address;
    }


    public String getPersonName()
    {
        return personName;
    }

    public int getPersonAge()
    {
        return personAge;
    }

    public String getPersonAddress()
    {
        return personAddress;
    }
    
    public String displayInfo()
    {
        return personName + " is " + personAge + " years old and lives at " + personAddress;
    }
}
