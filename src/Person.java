public class Person
{
    private final String personName;
    private final int personAge;
    private final String personAddress;

    public Person(String name, int age, String address)
    {
        personName = name;
        personAge = age;
        personAddress = address;
    }

    public String getName()
    {
        return personName;
    }

    public int getAge()
    {
        return personAge;
    }

    public String getAddress()
    {
        return personAddress;
    }

    @Override
    public String toString() 
    {
        return personName + " is " + personAge + " years old and lives at " + personAddress;
    }
}
