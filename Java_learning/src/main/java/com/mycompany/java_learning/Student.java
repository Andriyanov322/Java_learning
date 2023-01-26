package com.mycompany.java_learning;

public class Student 
{
    String name;
    String surname;
    int id;
    int course;
    double math_average;
    double econ_average;
    double foreign_average;
    double all_average;
    double average(double math_average1,double econ_average1,double foreign_average1) 
    {
        all_average = (math_average1 + foreign_average1 + econ_average1) / 3;
        return all_average;
    }
    Student(int id1, int course1, String name1, String surname1, double math_average1, double econ_average1, double foreign_average1) 
    {
        int id = id1;
        int course = course1;
        String name = name1;
        String surname = surname1;
        double math_average = math_average1;
        double econ_average = econ_average1;
        double foreign_average = foreign_average1;
        double all_average = average(math_average1, econ_average1, foreign_average1);
    }
    Student(int id2, int course2, String name2, String surname2)
    {
        this(id2, course2, name2, surname2, 0.0, 1.0, 0.0);
    }
    Student()
    {
        this(0,0,"Ivan","Ivanov", 0.0 , 0.0, 0.0);
    }
}

class StudentTest 
{
    public static void main(String[] args) 
    {
       
       Student stud1 = new Student();
       System.out.println(stud1.all_average);
       
       Student stud2 = new Student(1,2, "Nikita", "Petrov");
       System.out.println(stud2.all_average);
       
       Student stud3 = new Student(2,3,"Anton","Andriyanov", 4,2,4);
       System.out.println(stud3.all_average);
    }   
}
