package com.mycompany.java_learning;

public class HomeWorkLesson18_2 
{
    static void showArray(String [][]ar) 
    {
        System.out.print("{");
        for (int i = 0; i < ar.length; i++) 
        {
            System.out.print("{");
            for (int j = 0; j < ar[i].length; j++) 
            {
                System.out.print(ar[i][j]);
                if(j != ar[i].length - 1) System.out.print(",");
            }
            System.out.print("}");
        if(i != ar.length - 1) System.out.print(",");
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        String ar[][] = new String[][]{{"Все","я","вроде"},{"бы"},{"сделал","!"}};
        showArray(ar);
    }
}
