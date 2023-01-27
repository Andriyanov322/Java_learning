package com.mycompany.java_learning;

public class HomeWorkLesson8_2 
{
    static final double pi = 3.14;
    
    double SquareCircle(double r) 
    {
        return Math.round(pi * r * r);
    }
    static double LengthCircle(double r) 
    {
        return Math.round(2 * pi * r);
    }
    void AllInfo(double r) 
    {
        System.out.println("----\nРадиус: " + r + "\nРадиус окружности: " + Math.round(SquareCircle(r)) + "\nДлина окружности: " + Math.round(LengthCircle(r)));
    }   
}

class HomeWorkLesson8_2Test 
{
    public static void main(String[] args) 
    {
        HomeWorkLesson8_2 testing = new HomeWorkLesson8_2();
        System.out.println(testing.SquareCircle(5));
        System.out.println(HomeWorkLesson8_2.LengthCircle(5));
        System.out.println(testing.SquareCircle(3));
        System.out.println(HomeWorkLesson8_2.LengthCircle(3));
        testing.AllInfo(5);
        testing.AllInfo(3);
    }
    
}