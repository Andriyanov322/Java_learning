package com.mycompany.java_learning;

public class HomeWorkLesson8_1 
{
    static double multiply(double a, double b, double c) 
    {
        return a*b*c;
    }
    static void division(int a, int b) 
    {
        System.out.println("Целое частное: " + a/b + " Остаток: " + a%b);
    }
}

class HomeWorkLesson8_1Test 
{
    public static void main(String[] args) 
    {
        System.out.println(HomeWorkLesson8_1.multiply(5,5,8));
        System.out.println(HomeWorkLesson8_1.multiply(4,1,3));
        
        HomeWorkLesson8_1.division(15,4);
        HomeWorkLesson8_1.division(20,17);
    }   
}