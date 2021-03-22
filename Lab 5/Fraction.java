
package com.company;

public class Fraction
{
    private int integerA;
    private int integerB;

    public Fraction(int x, int y)
    {
        integerA = x;
        integerB = y;
    }

    public void setNumerator(int n)
    {
        integerA = n;
    }

    public void display()
    {
        System.out.print(integerA + "/" + integerB);
    }

    public boolean equals(Fraction f)
    {
        int num1, num2;
        int num3, num4;
        int num5 = 1;
        for (int i = 2; i <= Math.min(integerA, integerB); i++)
        {

            if (integerA % i == 0 && integerB % i == 0)
                num5 = i;
        }

        num1 = integerA / num5;
        num2 = integerB / num5;

        int gcf = 1;
        for (int i = 2; i <= Math.min(f.integerA, f.integerB); i++)
        {

            if (f.integerA % i == 0 && f.integerB % i == 0)
                gcf = i;
        }

        num3 = f.integerA / gcf;
        num4 = f.integerB / gcf;

        return (num1 == num3 && num2 == num4);

    }

}
