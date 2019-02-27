package com.neuedu.www.first;

public class BiaoDaShi04 {
    public static void main(String[] args) {
        /*boolean b=!(34!=56);
        System.out.println(b);*/

        //||   |
       /* int a=2,b=3;
        boolean bl=a++>1||b++<4;//短路或：只要右左边的表达式为TRUE，则右边表达式不在执行
        System.out.println(a);//3
        System.out.println(b);//3
        System.out.println(bl);//true*/
        int a=2,b=3;
        boolean bl=a++>1|b++<4;
        System.out.println(a);//3
        System.out.println(b);//4
        System.out.println(bl);//true
    }
}
