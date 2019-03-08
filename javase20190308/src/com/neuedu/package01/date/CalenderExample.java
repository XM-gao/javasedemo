package com.neuedu.package01.date;

import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR)+"年"+calendar.get(Calendar.MONTH)+"月");

    }

    /**
     *  输入字符串，如何提取这个字符串中的年月日
     */
}
