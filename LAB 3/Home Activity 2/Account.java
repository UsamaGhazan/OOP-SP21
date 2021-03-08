package com.company;
class Account {
    public int balance=100;
    public Account(){
        int deposit=21;
        int withdraw=42;

    }
    public Account(int x ,int y){
        int deposit=x;
        int withdraw=y;
        System.out.println("You have deposited "+x+" and withdrawn" +y);
    }
    public int deposit(){
        int deposit=x;
        return deposit;
    } public int withdraw(){
        int withdraw=y;
        return withdraw;
    }
}

