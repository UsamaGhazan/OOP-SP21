package com.company;

public class Rectangle implements shape {
    int length;
    int width;
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    public double area(){
        return length*width;



    }
}
