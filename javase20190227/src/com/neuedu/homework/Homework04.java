package com.neuedu.homework;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入年：");
        int year=scanner.nextInt();
        System.out.println("输入月：");
        int month=scanner.nextInt();
        System.out.println("输入日：");
        int day=scanner.nextInt();

        int days=0;
        //计算从1月开始到month-1的月中的所有天数和
        for(int i=1;i<month;i++){

            switch(i){
                case 4:
                case 6:
                case 9:
                case 11: days+=30;break;
                case 2:
                    if(year%4==0&& year%100!=0||year%400==0){
                        days+=29;
                    } else{
                        days+=28;
                    }
                    break;
                default: days+=31;
            }
        }

        days+=day;//当月的天数

        System.out.println(year+"年"+month+"月"+day+"日是这一年中的第"+days
        +"天");



    }
}
