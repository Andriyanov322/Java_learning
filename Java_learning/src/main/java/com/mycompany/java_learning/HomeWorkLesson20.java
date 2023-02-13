package com.mycompany.java_learning;

import java.util.*;

public class HomeWorkLesson20 
{
    static ArrayList abc (String... s1)
    {
    ArrayList <String> s2 = new ArrayList<>(Arrays.asList(s1));
    Collections.sort(s2);
        System.out.println(s2);
    return s2;
    }
    public static void main(String[] args) 
    {
    abc("B","A","C","Z","H"); 
    }
}
