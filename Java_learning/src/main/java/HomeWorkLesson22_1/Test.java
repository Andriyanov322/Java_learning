package HomeWorkLesson22_1;

public class Test 
{
    public static void main(String[] args) 
    {
        Dog d1 = new Dog("Жучка");
        System.out.println("Количество лап: " + d1.paw);
        
        System.out.println("");
        
        Cat c1 = new Cat("Барсик");
        c1.sleep();               
    }   
}
