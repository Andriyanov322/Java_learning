package com.mycompany.java_learning;

public class HomeWork11Car 
{
    String color;
    String engine;
    int doorAmount; 
    
    HomeWork11Car(String color, String engine, int doorAmount) 
    {
        this.color = color;
        this.engine = engine;
        this.doorAmount = doorAmount;
    }
}

class CarTest 
{
    static void changeDoor (HomeWork11Car car1, int amount) 
    {
        car1.doorAmount = amount;    
    }
    
    static void changeColor (HomeWork11Car car1, HomeWork11Car car2) 
    {
        HomeWork11Car temp = new HomeWork11Car("yellow", "V4", 3);
        temp.color = car1.color;
        car1.color = car2.color;
        car2.color = temp.color;
    }
    
    static void outputText (HomeWork11Car car1, HomeWork11Car car2) 
    {
        System.out.println("-----");
        System.out.println("Текущие характеристики первой машины: ");
        System.out.println("Цвет: " + car1.color);
        System.out.println("Двигатель: " + car1.engine);
        System.out.println("Количство дверей: " + car1.doorAmount);
        System.out.println("-----");
        System.out.println("Текущие характеристики второй машины: ");
        System.out.println("Цвет: " + car2.color);
        System.out.println("Двигатель: " + car2.engine);
        System.out.println("Количство дверей: " + car2.doorAmount);
    }
    
    public static void main(String[] args) 
    {
        HomeWork11Car c1 = new HomeWork11Car("black", "V6", 5);
        HomeWork11Car c2 = new HomeWork11Car("red", "V8", 7);
        
        outputText(c1,c2);
        
        changeDoor(c1, 8);
        changeDoor(c2, 3);
        
        changeColor(c1,c2);
        
        System.out.println("\nИзменение...\n");
        
        outputText(c1,c2);
    }
}
