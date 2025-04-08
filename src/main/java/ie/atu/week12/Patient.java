package ie.atu.week12;

public class Patient
{
    private String familyName;
    private String name;
    private String HSEnum;
    private int age;


    public Patient(String familyName, String name, String HSEnum, int age)
    {
    this.familyName = familyName;
    this.name = name;
    this.HSEnum = HSEnum;
    this.age = age;
    }
    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getHSEnum()
    {
        return HSEnum;
    }

    public void setHSEnum(String HSEnum)
    {
        this.HSEnum = HSEnum;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
