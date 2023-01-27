package AccessTest;

public class AccessTestClass {
    public static void main(String[] args) {
        com.mycompany.java_learning.Employee e1 = new com.mycompany.java_learning.Employee(1,18,"IT", "Andropov", 123531);
        e1.Salary();
        e1.Surname();
        e1.ID();
        com.mycompany.java_learning.Employee e2 = new com.mycompany.java_learning.Employee(1,18,"IT", "Andropov");
        e2.Salary();
        e2.Surname();
        e2.ID();
        com.mycompany.java_learning.Employee e3 = new com.mycompany.java_learning.Employee(1,18,"IT");
        e3.Salary();
        e3.Surname();
        e3.ID();
    }
}
