package com.neuedu.www.first;

public class NumberType01 {
    public static void main(String[] args) {
        double  d=45+'a'*2-1.2;//自动转换
        int  int1=(int)d;//强制转换

        System.out.println(d);
    }
}
