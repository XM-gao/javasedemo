package com.neuedu.function.object.overload;

public class Test {
    public static void main(String[] args) {
        AddExample example=new AddExample();
        double sum=example.add(45,12);
        double sumdouble=example.add(12,12.5);
        System.out.println(sum);
        System.out.println(sumdouble);
    }
}
