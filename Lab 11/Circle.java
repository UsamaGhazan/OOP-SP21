package com.company;

public class Circle implements shape {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);

    }
}
