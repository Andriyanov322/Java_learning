package com.mycompany.java_learning;

public class Employee 
{
    int id;
    int age;
    String department;    
    
    public String surname;
    
    private int salary;
    
    public Employee(int i1, int age1, String department1, String surname1, int salary1) 
    {
        id = i1;
        age = age1;
        department = department1;
        surname = surname1;
        salary = salary1;
    }
    public Employee(int i1, int age1, String department1, String surname1) 
    {
        id = i1;
        age = age1;
        department = department1;
        surname = surname1;
        salary = 100000;
    }
    public Employee(int i1, int age1, String department1) 
    {
        id = i1;
        age = age1;
        department = department1;
        surname = "Ivanov";
        salary = 101000;
    }
    
    public void Salary() 
    {      
        System.out.println("Текущий оклад сотрудника " + salary);
    }
    public void Surname() 
    {      
        System.out.println("Текущая фамилия сотрудника " + surname);
    }
    public void ID() 
    {      
        System.out.println("Текущий идентификатор сотрудника " + id);
        System.out.println("----");
    }
    public static void main(String[] args) 
    {
        Employee e1 = new Employee(1,18,"IT", "Andropov", 123531);
        e1.Salary();
        e1.Surname();
        e1.ID();
        Employee e2 = new Employee(1,18,"IT", "Andropov");
        e2.Salary();
        e2.Surname();
        e2.ID();
        Employee e3 = new Employee(1,18,"IT");
        e3.Salary();
        e3.Surname();
        e3.ID();
    }
}

class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee(1,18,"IT", "Andropov", 123531);
        e1.Salary();
        e1.Surname();
        e1.ID();
        Employee e2 = new Employee(1,18,"IT", "Andropov");
        e2.Salary();
        e2.Surname();
        e2.ID();
        Employee e3 = new Employee(1,18,"IT");
        e3.Salary();
        e3.Surname();
        e3.ID();
    }
}
