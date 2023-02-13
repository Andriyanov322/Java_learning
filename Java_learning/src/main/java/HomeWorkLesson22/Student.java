package HomeWorkLesson22;

public class Student 
{
    private StringBuilder name = new StringBuilder();
    private int course;
    private double grade;
    
    public void setName(StringBuilder name) 
    {
        StringBuilder temp = new StringBuilder(name);
        StringBuilder wrong = new StringBuilder("Неверное имя");
        if(temp.length() > 3)
        {
            this.name = temp;
        }
        else
        {
            this.name = wrong;
        }
    }
    
    public StringBuilder getName() 
    {
        return name;
    }
    
    public void setCourse(int course) 
    {
        if(course >= 1 && course <= 4)
        {
            this.course = course;
        }
        else
        {
            this.course = 0;
        }
    }
    
    public int getCourse() 
    {
        return course;
    }
    
    public void setGrade(double grade)
    {
        if(grade >= 1 && grade <= 10)
        {
            this.grade = grade;
        }
        else
        {
            this.grade = 0;
        }
    }
    
    public double getGrade() 
    {
        return grade;
    }
    
    public void showInfo () 
    {
        System.out.println("Имя данного студента: " + this.getName());
        System.out.println("Курс данного студента: " + this.getCourse());
        System.out.println("Оценка данного студента " + this.getGrade());
    }
}

class TestStudent 
{
    public static void main(String[] args) 
    {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Максим"));
        st1.setCourse(4);
        st1.setGrade(7.2);
        st1.showInfo();
        
        System.out.println("");
        
        Student st2 = new Student();
        st2.setName(new StringBuilder("Ок"));
        st2.setCourse(8);
        st2.setGrade(15.5);
        st2.showInfo();        
    }
}
