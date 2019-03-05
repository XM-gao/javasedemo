package com.neuedu.overload;

public class AddExample {

     protected int add(int a,int b){
         return a+b;
     }
    public double add(double a,int b){
         return a+b;
     }
    double add(double a,int b,int c){
        return a+b+c;
    }
}
