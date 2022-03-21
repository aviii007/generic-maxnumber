package com.bridgelabz.maxnumber;

public class Main {
    public static void findMaxInteger(int num1,int num2,int num3){
        int max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("The Greatest Integer value is:- " +max);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Generic Program to find maximum number");
        int num1=100,num2=200,num3=300;
        findMaxInteger(num1,num2,num3);
    }
}

