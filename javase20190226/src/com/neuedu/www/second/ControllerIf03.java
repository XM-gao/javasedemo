package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerIf03 {
    public static void main(String[] args) {
        /**
         *  if（判断语句）{
         *      if(判断语句2){
         *
         *  }else{
         *
         *  }
         *  }else {
         *  if(判断语句2){
         *
         *  }else{
         *
         *  }
         *  }
         *  特殊：
         *  if（判断语句）{
         *      真语句
         *  }else {
         *  if(判断语句2){
         *      真语句2
         *  }else{
         *     if（判断语句3）{
         *         真语句3
         *     }else{
         *         假语句
         *     }
         *
         *  }
         *  }
         *  ====
         *  if（判断语句）{
         *      真语句
         *  }else if（判断语句2）{
         *      真语句2
         *  }else if(判断语句3){
         *      真语句3
         *  }else{
         *      假语句
         *  }
         *
         *
         */

        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入年份：");
        n=scanner.nextInt();

     /*   if(n%3==0&&n%7!=0){
            System.out.println("满足条件的");
        }else{
            System.out.println("不满足条件的");
        }*/
        if(n%3==0){
            if(n%7!=0){
                System.out.println("满足条件的");
            }else{
                System.out.println("不满足条件的");
            }
        }else {
            System.out.println("不满足条件的");
        }

    }
}
