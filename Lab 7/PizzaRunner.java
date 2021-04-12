package com.company;

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza p1=new Pizza();
        Pizza p2=new Pizza();
        Pizza p3=new Pizza();
        // Testing Pizza class
        p1.setNoofcheesetoppings(1);
        p1.setNoofhamtoppings(1);
        p1.setNoofpepptoppings(2);
        p1.setPizzasize("Large");
        System.out.println(p1.calcCost());
        System.out.println(p1.getDescription());

        p2.setNoofcheesetoppings(3);
        p2.setNoofhamtoppings(5);
        p2.setNoofpepptoppings(9);
        p2.setPizzasize("Medium");
        System.out.println(p2.calcCost());
        System.out.println(p2.getDescription());

        p3.setNoofcheesetoppings(2);
        p3.setNoofhamtoppings(5);
        p3.setNoofpepptoppings(6);
        p3.setPizzasize("Small");
        System.out.println(p3.calcCost());
        System.out.println(p3.getDescription());

        Pizzaorder po=new Pizzaorder();
        po.setPizza1(p1);
        po.setPizza1(p2);
        po.setPizza1(p3);

        System.out.println("Total order cost is "+po.calcTotal()+"$");


        }
    }

