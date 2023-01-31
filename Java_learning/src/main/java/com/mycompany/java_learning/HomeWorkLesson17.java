package com.mycompany.java_learning;

public class HomeWorkLesson17 
{
    static boolean ravenstvo(StringBuilder s1, StringBuilder s2)
    {
        boolean equal1 = s1.equals(s2);
        return equal1;
    }
    public static void main(String[] args) 
    {
        StringBuilder s1 = new StringBuilder("abc");
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println(ravenstvo(s1,s2));
    }
}
