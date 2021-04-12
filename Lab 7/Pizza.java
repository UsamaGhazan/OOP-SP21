package com.company;
import java.util.Scanner;
public class Pizza {
    private String pizzasize;
    private int noofcheesetoppings;
    private int noofpepptoppings;
    private int noofhamtoppings;
    public Pizza(){
        pizzasize="Large";
        noofcheesetoppings=3;
        noofpepptoppings=5;
        noofhamtoppings=1;

    }

    public void setPizzasize(String pizzasize) {
        this.pizzasize = pizzasize;
    }

    public String getPizzasize() {
        return pizzasize;
    }

    public void setNoofcheesetoppings(int noofcheesetoppings) {
        this.noofcheesetoppings = noofcheesetoppings;
    }

    public int getNoofcheesetoppings() {
        return noofcheesetoppings;
    }

    public void setNoofpepptoppings(int noofpepptoppings) {
        this.noofpepptoppings = noofpepptoppings;
    }

    public int getNoofpepptoppings() {
        return noofpepptoppings;
    }

    public void setNoofhamtoppings(int noofhamtoppings) {
        this.noofhamtoppings = noofhamtoppings;
    }

    public int getNoofhamtoppings() {
        return noofhamtoppings;
    }
    public double calcCost(){
        if (pizzasize=="Small"){
            return (10+(2*noofcheesetoppings)+(2*noofhamtoppings)+(2*noofpepptoppings));
        }
        else if(pizzasize=="Medium"){
            return (12+(2*noofcheesetoppings)+(2*noofhamtoppings)+(2*noofpepptoppings));


        }
        else if(pizzasize=="Large"){
            return (14+(2*noofcheesetoppings)+(2*noofhamtoppings)+(2*noofpepptoppings));


        }
        else{
            System.out.println("Invalid input");
            return 0;
        }

    }
    public String getDescription(){
        return ("Size of pizza is "+pizzasize+" No of cheese toppings is "+noofcheesetoppings+" No of  pepperoni toppings is "+noofpepptoppings+" No of ham topppings is "+noofhamtoppings);

    }

}
