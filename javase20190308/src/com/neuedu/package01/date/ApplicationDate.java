package com.neuedu.package01.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplicationDate {
    public static void main(String[] args) throws ParseException {
        /**
         * 计算两个时间段的差，出来结果为：多小小时
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入时间1：");
        String date1=scanner.next();
        System.out.println("输入时间2：");
        String date2=scanner.next();

        //转换为Date

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//格式化：2019-03-08
        Date d1=dateFormat.parse(date1);
        Date d2=dateFormat.parse(date2);



        //计算
        long  time=Math.abs(d1.getTime()-d2.getTime());//时间---》毫秒数--》相减

        long hour=time/(60*60*1000);//小时
        System.out.println(date1+"与"+date2+"相差"+hour+"小时");
    }
}
