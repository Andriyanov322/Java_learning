package com.mycompany.java_learning;

import java.util.Arrays;

public class HomeWorkLesson18_1 
{
    static String sortirovka (int []ar) 
    {       
        for(int i = 0 ; i < ar.length - 1 ; i++) 
        {    
            for(int k = 0 ; k < ar.length - i - 1 ; k++)
            {
                if(ar[k] > ar[k+1])
                {
                    int swap = ar[k];
                    ar[k] = ar[k+1];
                    ar[k+1] = swap;
                }
            }             
        }
        String output = Arrays.toString(ar);
        return output;
    }
    public static void main(String[] args) 
    {
        int []ar = new int[]{7,10,8,13,4,52,51,43,313,4123,12,44,56};
        System.out.println(sortirovka(ar));
    }
}
