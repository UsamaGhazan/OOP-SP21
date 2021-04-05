package com.company;

public class Calculator {
   public static int sum(int num1,int num2){
       int sum=num1+num2;
       return sum;
   }
   public static int multiply(int num1,int num2){
       return num1*num2;
   }
   public static int divide(int num1,int num2){
        return num1/num2;
   }
   public static int modulus(int num1,int num2){
        return num1%num2;
   }
   public static double sin(int num){
        return Math.sin(num);
   }public static double cos(int num){
        return Math.cos(num);
   }
   public static double tan(int num){
        return Math.tan(num);
   }

}
