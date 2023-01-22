package com.mycompany.java_learning;

public class Employee 
{
    int id;
    String surname;
    int age;
    int salary;
    String department;
    
    Employee() 
    {
        id = 1;
        surname = "Ivanov";
        age = 18;
        salary = 20000;
        department = "common";
    }
    
    void SalaryDouble() 
    {
        salary *= 2;
        System.out.println("Текущий оклад сотрудника " + surname + ": " + salary);
    }
}

class EmployeeTest 
{
    public static void main(String[] args) {
        Employee raboytaga1 = new Employee();
        raboytaga1.surname = "Maksim";
        raboytaga1.salary = 32123;
        raboytaga1.SalaryDouble();
        
        Employee raboytaga2 = new Employee();
        raboytaga2.surname = "Anton";
        raboytaga2.salary = 76131;
        raboytaga2.SalaryDouble();
    }
}
