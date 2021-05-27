package com.company;


public class Runner {
    public static void main(String[] args) {
        shape[] objs=new shape[6];
        objs[0]=new Circle(8);
        objs[1]=new Rectangle(7,4);
        objs[2]=new Triangle(2,4);
        objs[3]=new Triangle(14,7);
        objs[5]=new Circle(23);

        double[] arrayArea = calculateAreas.area(objs);
        for(double area: arrayArea) {
            System.out.println(area);
        }
    }
}

