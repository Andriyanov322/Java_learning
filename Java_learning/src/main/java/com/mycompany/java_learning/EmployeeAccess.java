package com.mycompany.java_learning;

public class EmployeeAccess {
    public static void main(String[] args) {
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
