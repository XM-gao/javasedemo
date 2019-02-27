package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerIf02 {
    public static void main(String[] args) {
        //输入年，判断此年是平年还是闰年
        //1:输入
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入年份：");
        year=scanner.nextInt();

        //2：判断 3：结果
        //四年一润，百年不润，
        // 四百年一润
        //year %4==0 && year%100!=0  || year%400==0

        if(year %4==0 && year%100!=0  || year%400==0){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }
        /**
         * 1:输入一个数值，判断此数是否能够被3整除，但不能被7整除
         */

    }
}
