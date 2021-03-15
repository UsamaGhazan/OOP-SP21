package com.company;
public class hotDogStand
{
    private int standidN0;
    private int hotDogsSold;

    private static int totalHotDogsSold = 0;

    public hotDogStand()
    {
        standidN0 = 0;
        hotDogsSold = 0;
    }

    public hotDogStand(int newStandID, int newHotDogsSold)
    {
        standidN0= newStandID;
        hotDogsSold = newHotDogsSold;
        totalHotDogsSold += newHotDogsSold;
    }

    public void justSold()
    {
        hotDogsSold++;
        totalHotDogsSold++;
    }

    public int getHotDogsSold()
    {
        return hotDogsSold;
    }

    public static int getTotalHotDogsSold()
    {
        return totalHotDogsSold;
    }

    public int getStandsID()
    {
        return standidN0;
    }


}



