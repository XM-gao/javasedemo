package com.neuedu.first;

public class ControllerWhile {
    public static void main(String[] args) {
         //while do while 实现1到100之和
        /**
         *    while(判断){
         *        循环体
         *    }
         *    判断满足条件执行循环体，不满足，退出循环
         *    先判断后执行
         *
         *
         *    do{
         *        循环体
         *    }while(判断条件);
         *
         *    执行一次，判断，满足条件循环，不满足退出
         *
         *    先执行后判断
         *
         */

        int sum=0;
        int i=10;
/*
       while(i<10){
            sum+=i++;//sum=sum+i；i=i+1

        }

        System.out.println("求和结果："+sum);
        System.out.println("i："+i);
*/


        do{
            sum+=i++;
        }while (i<10);


        System.out.println("求和结果："+sum);
        System.out.println("i："+i);



    }
}
