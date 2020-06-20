package student;



public class Student {
    private long id;
    private String  name, gender;
    private int  age, grade;
   
    
    public Student()
    {
    }
    
    public Student(long id ,String name, String gender, int age, int grade)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }
    
    public long getId() 
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

     public String getGender() 
     {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public int getAge() 
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }



    public int getGrade() 
    {
        return grade;
    }

    public void setGrade(int grade) 
    {
        this.grade = grade;
    }


    
    
}
