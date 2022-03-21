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

    public static void findMaxDouble(double num1,double num2,double num3){
        double max=num1;
        if (max<num2){
            max=num2;
        }
        if (max<num3){
            max=num3;
        }
        System.out.println("The Greatest Double value is:- "+max);
    }

    public static void findMaxString(String a,String b,String c){
        String max=a;
        if (max.compareTo(b)<0){
            max=b;
        }
        if (max.compareTo(c)<0){
            max=c;
        }
        System.out.println("The Greatest String is:- " +max);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Generic Program to find maximum number");
        int num1=100,num2=200,num3=300;
        findMaxInteger(num1,num2,num3);
        double a=20.5,b=40.5,c=60.5;
        findMaxDouble(a,b,c);
        String s1="ashvini",s2="kanojia",s3="jabalpur";
        findMaxString(s1,s2,s3);
    }
}

