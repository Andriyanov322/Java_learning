package com.mycompany.java_learning;

public class Student 
{
    String name;
    int id;
    int course;

    Student(int id, int course, String name) 
    {
        this.id = id;
        this.course = course;
        this.name = name;
    }
}

class StudentTest 
{
    static void studentEquals(Student st1, Student st2) 
    {
        if (st1.name.equals(st2.name) && st1.id == st2.id && st1.course == st2.course) 
        {
            System.out.println("Студенты равны");
        }
        else
        {
            System.out.println("Студенты отличаются");
        }
    }
    static void studentEquals2(Student st1, Student st2) 
    {
        if (st1.name.equals(st2.name))
        {
            if (st1.id == st2.id)
            {
                if (st1.course == st2.course)
                {
                    System.out.println("Студенты одинаковые");
                }
                else
                {
                    System.out.println("Студенты отличаются");
                }
            }
            else
            {
                System.out.println("Студенты отличаются");
            }
        }
        else
        {
            System.out.println("Студенты отличаются");
        }
    }
    public static void main(String[] args) 
    {
        Student st1 = new Student(1,5,"Maksim");
        
        Student st2 = new Student(1,5,"Maksim");
        
        studentEquals(st1, st2);
        studentEquals2(st1, st2);
        
    }   
}
