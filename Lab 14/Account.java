package com.company;
import java.io.Serializable;
public class Account implements Serializable {
    public String accountNumber;
    public int balance;
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance)

    {
        this.balance = balance;
    }
    public int deposit(int amount) {
        balance = balance + amount;
        return balance;
    }
    public int withdraw(int amount) {
        balance = balance - amount;
        return balance;
    }

    public int transfer(int amount) {
        balance -= amount;
        return balance;
    }

    public int totalbalance() {
        return balance;
    }

    public String toString() {
        return Account + accountNumber = ' + accountNumber + '\
        '' + , balance = +balance + '' + \n;
    }


}

