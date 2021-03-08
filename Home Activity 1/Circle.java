package com.company;

public class Circle{
    public int radius;
    public Circle(){
        radius=21;
    }

    public Circle(int x){
        radius=x;

    }
    public double circumference(){
        return (2*Math.PI*radius);

    }
}
