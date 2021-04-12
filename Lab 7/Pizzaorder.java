package com.company;

public class Pizzaorder {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public void setPizza1(Pizza pizza1) {
        this.pizza1 = pizza1;
    }

    public Pizza getPizza1() {
        return pizza1;
    }

    public void setPizza2(Pizza pizza2) {
        this.pizza2 = pizza2;
    }

    public Pizza getPizza2() {
        return pizza2;
    }
    public void setPizza3(Pizza pizza3){
        this.pizza3=pizza3;
    }
    public Pizza getPizza3(){
        return pizza3;
    }
    public double calcTotal(){

        double total=0;
        if(pizza1!=null)
            total=total+pizza1.calcCost();
        if(pizza2!=null)
            total=total+pizza2.calcCost();
        if(pizza3!=null)
            total=total+pizza3.calcCost();
        return total;


    }

}
