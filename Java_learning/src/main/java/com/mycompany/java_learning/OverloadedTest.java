package com.mycompany.java_learning;

public class OverloadedTest 
{
    int sum() 
    {
        return 0;
    }
    int sum(int i1) 
    {
        return i1;
    }
    int sum(int i1, int i2) 
    {
        return i1+i2;
    }
    int sum(int i1, int i2, int i3) 
    {
        return i1+i2+i3;
    }
    int sum(int i1, int i2, int i3, int i4) 
    {
        return i1+i2+i3+i4;
    }
}

class Overloaded 
{
    public static void main(String[] args) 
    {
        OverloadedTest a = new OverloadedTest(); 
        int a1 = a.sum();
        System.out.println(a1);
        
        OverloadedTest b = new OverloadedTest(); 
        int b1 = b.sum(2);
        System.out.println(b1);
        
        OverloadedTest c = new OverloadedTest(); 
        int c1 = c.sum(2,2);
        System.out.println(c1);
        
        OverloadedTest d = new OverloadedTest(); 
        int d1 = d.sum(2,2,2);
        System.out.println(d1);
        
        OverloadedTest e = new OverloadedTest(); 
        int e1 = e.sum(2,2,2,2);
        System.out.println(e1);
    }
}