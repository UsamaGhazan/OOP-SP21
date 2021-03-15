package com.company;

public class LAB4AssignmentRunner {
    public static void main(String[] args)
    {
        hotDogStand d1 = new hotDogStand(42,21);
        hotDogStand d2 = new hotDogStand(12,2);
        hotDogStand d3 = new hotDogStand(33,98);

        d1.justSold();
        d1.justSold();
        d1.justSold();

        d2.justSold();
        d2.justSold();
        d2.justSold();

        d3.justSold();
        d3.justSold();
        d3.justSold();

        System.out.printf("%-10s%10s\n", "Stand's ID No", "  HotDogs Sold");
        System.out.printf("%-10d%10d\n", d1.getStandsID(), d1.getHotDogsSold());
        System.out.printf("%-10d%10d\n", d2.getStandsID(), d2.getHotDogsSold());
        System.out.printf("%-10d%10d\n", d3.getStandsID(), d3.getHotDogsSold());

        System.out.println("\n Total number of hot dogs sold by the stand= "
                        + hotDogStand.getTotalHotDogsSold());
    }

}

