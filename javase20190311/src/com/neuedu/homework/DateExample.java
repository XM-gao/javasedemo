package com.neuedu.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateExample {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入订票的日期：");
        String dateString="";
       while(true){
            dateString=scanner.next();
            if(checkDate(dateString)==-1){//判断日期是否合法：-1日期不合法
                System.out.println("日期有误，输入订票的日期：");
            }else{
                break;
            }

        }

       if(checkDate(dateString)==0) {
           //要获取当前的时间点：
           Calendar now=Calendar.getInstance();
           System.out.println("从"+now.get(Calendar.HOUR)+":"+now.get(Calendar.MINUTE)+"开始的票");
       }else{
           System.out.println("全天的票");
       }



    }

    public  static int checkDate(String dateString){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        // 将字符串日期转换为日期类型
        try {
           date=simpleDateFormat.parse(dateString);
           /* Date now=new Date();*/
        } catch (ParseException e) {
            e.printStackTrace();
        }



        //输入的日期
        Calendar cdate=Calendar.getInstance();
        cdate.setTime(date);

        //当天的日期
        Calendar now=Calendar.getInstance();

        //30天之后的日期
        Calendar wnow=Calendar.getInstance();
        wnow.add(Calendar.DAY_OF_MONTH,30);


        //System.out.println(wnow.get(Calendar.YEAR)+"  "+(wnow.get(Calendar.MONTH)+1)+"  "+wnow.get(Calendar.DAY_OF_MONTH));
        //判断是否是当天的日期，如果是，则返回0
        if(cdate.get(Calendar.YEAR)==now.get(Calendar.YEAR)&&cdate.get(Calendar.MONTH)==now.get(Calendar.MONTH)&&cdate.get(Calendar.DAY_OF_MONTH)==now.get(Calendar.DAY_OF_MONTH)){
            return 0;
        }else if(cdate.compareTo(now)>0&&cdate.compareTo(wnow)<=0){//判断是否是第二天开始的日期到第30天的日期
            return 1;
        }else{//都不满足，则返回-1
            return -1;
        }
    }
}
