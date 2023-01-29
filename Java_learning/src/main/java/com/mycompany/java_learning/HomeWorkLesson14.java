package com.mycompany.java_learning;

public class HomeWorkLesson14 
{
    static void outputTime() 
    {
        OUTER: for(int h = 0, m = 0, s = 0; h <= 6 ; h++) 
        {           
            MIDDLE: for(m = 0; m < 60; m++)
            {
            if (h>1 && m % 10 == 0) 
                {
                    break OUTER;
                }                
                INNER: for(s = 0; s < 60; s++) 
                {
                    if (s*h>m) 
                    {
                        continue INNER;
                    }
                    System.out.println("Текущее время: " + h + ":" + m + ":" + s);
                }                
            }
        }
    }
    public static void main(String[] args) {
        outputTime();
    }
}
