package com.mycompany.java_learning;

public class HomeWorkLesson24 {
    
}

abstract class Animal
{
    Animal(String n)
    {
        String name = n;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal
{
    Fish(String n)
    {
        String name = n;
    }
}