package com.neuedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        int n=1,m=1;
        int c=0;
        for(int i=3;i<=24;i++){
            c=n+m;
            n=m;
            m=c;
        }

        System.out.println("第二十四个月兔子的个数："+c*2);
    }
}
