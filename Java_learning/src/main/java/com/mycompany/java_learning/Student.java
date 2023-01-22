package com.mycompany.java_learning;

public class Student 
{
    String name;
    String surname;
    double math_average;
    double econ_average;
    double foreign_average;
    double all_average;
    void average() 
    {
        all_average = (math_average + foreign_average + econ_average) / 3;
        String S_average = String.format("%.2f", all_average);
        System.out.println("Средняя оценка студента " + name + " " + surname + ": " + S_average);
    }
}

class StudentTest 
{
    public static void main(String[] args) {
       
       Student stud1 = new Student();
       stud1.name = "Maksim";
       stud1.surname = "Andriyanov";
       stud1.math_average = 4.5;
       stud1.econ_average = 3.2;
       stud1.foreign_average = 4.9;
       stud1.average();
       
       Student stud2 = new Student();
       stud2.name = "Sasha";
       stud2.surname = "Prikolov";
       stud2.math_average = 1.1;
       stud2.econ_average = 1.2;
       stud2.foreign_average = 1.3;
       stud2.average();
       
       Student stud3 = new Student();
       stud3.name = "Masha";
       stud3.surname = "Churchil";
       stud3.math_average = 3.3;
       stud3.econ_average = 1.2;
       stud3.foreign_average = 5.0;
       stud3.average();
    }   
}
