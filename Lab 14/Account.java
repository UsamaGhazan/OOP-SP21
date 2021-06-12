package com.company;
import java.io.*;
import java.util.*;

class Account implements Serializable{

    protected String name;
    protected int acc_no;
    protected double balance;

    public Account(double Balance){
        acc_no = 799;
        balance = Balance;
    }

    public String getName(){
        return name;
    }
    public int getAccountNo(){
        return acc_no;
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String Name ){
        name = Name;
    }
    public void setAccountNo(int Acc_No){
        acc_no = Acc_No;
    }
    public void setBalance(double Balance){
        balance = Balance;
    }

    public void withdraw(double Balance){
        if (Balance <= balance)
            balance = balance - Balance;
        else
            System.out.println("Sorry ! Insuffieciet Balance ! ");
    }
    public void deposit(double Balance){
        balance = balance + Balance;
    }
}