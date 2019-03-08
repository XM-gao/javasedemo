package com.neuedu.package01.date;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date=new Date(45678912L);
        date.getTime();//毫秒数
        System.out.println(date);
    }
}
