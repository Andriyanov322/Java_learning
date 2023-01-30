package com.mycompany.java_learning;

public class HomeWorkLesson16 
{
    static void email(String s1) 
    {
        String[] parts = s1.split("; ");
        for (String s2 : parts) 
        {
            int i1 = s2.indexOf("@");
            int i2 = s2.indexOf(".");
            s2 = s2.substring(i1+1,i2);
            System.out.println(s2);
        }
    }
    public static void main(String[] args) 
    {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
