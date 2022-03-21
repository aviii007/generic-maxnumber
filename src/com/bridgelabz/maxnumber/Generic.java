package com.bridgelabz.maxnumber;

public class Generic {
    public static  <E extends Comparable> E getMaximum(E a, E b, E c){
        E max=a;
        if(b.compareTo(a)>0 && b.compareTo(a)>0){
            max=b;
        }else if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Java Generic Program to find maximum number");
        int num1=100,num2=200,num3=300;
        System.out.println("The Greatest Integer Value is: ");
        System.out.println(getMaximum(num1,num2,num3));
        double a=20.5,b=40.5,c=60.5;
        System.out.println("The Greatest Double Value is: ");
        System.out.println(getMaximum(a,b,c));
        String s1="ashvini",s2="kanojia",s3="jabalpur";
        System.out.println("The Greatest String Value is: ");
        System.out.println(getMaximum(s1,s2,s3));
    }
}
