package com.neuedu.function.object.overload;

public class AddExample {

    int add(int a,int b){
        return a+b;
    }
    double add(int a,double b){
        return a+b;
    }

    double add(double a,int b){
        return  a+b;
    }

    int add(int a,int b,int c){
        return  a+b+c;
    }

}
