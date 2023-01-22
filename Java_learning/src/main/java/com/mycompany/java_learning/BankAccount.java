package com.mycompany.java_learning;

public class BankAccount {
    int balance;
    
    int popolnenieScheta(int a)
    {
        balance += a;
        return balance;
    }
    
    int snyatieSoScheta(int a)
    {
        balance -= a;
        return balance;
    }
    
    void showinfo()
    {
        System.out.println("На вашем счете: " + balance);
    }
}

class BankAccountTest 
{
    public static void main(String[] args) {
        BankAccount bb1 = new BankAccount();
        bb1.popolnenieScheta(1324);
        bb1.snyatieSoScheta(1320);
        bb1.showinfo();
        
        BankAccount bb2 = new BankAccount();
        bb2.popolnenieScheta(134223);
        bb2.snyatieSoScheta(13211);
        bb2.showinfo();        
    }
}
