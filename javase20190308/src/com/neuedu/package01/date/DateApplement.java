package com.neuedu.package01.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateApplement {
    public static void main(String[] args) {
        /**
         *  输入字符串，如何提取这个字符串中的年月日
         */
        /***
         * 字符串时间----》Date（java.util.Date）===>Calender==>年月日
         *      SimpleDateFormat
         */
        //字符串时间----》Date（java.util.Date）
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//格式化：2019-03-08
        String string="2019-03-08";
        try {
            Date date=dateFormat.parse(string);
            Calendar calendar=Calendar.getInstance();
            //Date（java.util.Date）===>Calender
            calendar.setTime(date);
            //年月日
            System.out.println(calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日");

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
