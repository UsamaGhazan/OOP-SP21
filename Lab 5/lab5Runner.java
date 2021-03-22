
package com.company;

import java.util.Scanner;
public class lab5Runner {
    public static void main(String[]args){
        int integerA, integerB;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        integerA = input.nextInt();
        System.out.print("Enter Divisor ");
        integerB = input.nextInt();
        Fraction f = new Fraction(integerA, integerB);
        System.out.print("Enter Dividend: ");
        int A = input.nextInt();
        System.out.print("Enter Divisor: ");
        int B = input.nextInt();
        Fraction F2 = new Fraction(A,B);
        if (f.equals(F2)) {
            f.display();
            System.out.print(" is equal to ");
            F2.display();
        }
        else
        {
            f.display();
            System.out.print(" is not equal to ");
           F2.display();
        }
    }
}
