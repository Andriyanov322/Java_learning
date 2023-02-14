package HomeWorkLesson22_1;

public class Pet extends Animal
{
    
    Pet () 
    {       
        System.out.println("I am pet");
        eyes = 2;        
    }
    
    void jump ()
    {
        System.out.println("Pet jumps");
    }
    
    void run() 
    {
        System.out.println("Pet runs");
    }
    
    String name;
    int tail = 1;
    int paw = 4;
    
}
