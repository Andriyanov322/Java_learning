package com.mycompany.java_learning;

public class HomeWorkLesson15 
{
    static void outputTime() 
    {
        int h = 0;
        OUTER: while(h<6)
        {
            int m=-1;          
            MIDDLE: do
            {                  
                m++;
                if (h>1 && m % 10 == 0) 
                {
                    break OUTER;
                }  
                int s = 0;
                INNER: while(s < 60) 
                {
                    if (s*h>m) 
                    {
                        continue MIDDLE;
                    }
                    System.out.println("Текущее время: " + h + ":" + m + ":" + s);
                    s++;
                }     
            }            
            while(m<59);
            h++;
        }
    }
    public static void main(String[] args) {
        outputTime();
    }    
}
