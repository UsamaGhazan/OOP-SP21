package com.company;

public class Triangle implements shape {
    private int a;
    private int b;

    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double area(){
        return (a*b)/2;

    }
}
