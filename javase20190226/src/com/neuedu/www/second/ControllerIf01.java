package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerIf01 {
    public static void main(String[] args) {
        //>=1表示天气好
        //<1 表示天气不好
        int n;
        Scanner scan=new Scanner(System.in);//Scanner类：所在的包java.util.Scanner，当使用的时候，必须通过import调用此包
                                            //接收标准的输入（System.in），传到下面的参数
        System.out.println("输入数值");//说明
        n=scan.nextInt();

        if(n>=1){//必须是一个逻辑值，有比较运算符或者逻辑运算符，所产生的逻辑值
             //当表达式值为true执行下面的语句
            System.out.println("踏春");
        }else{
            //当表达式值为false执行下面的语句
            System.out.println("睡觉");
        }



       /* if(n>=1) {//必须是一个逻辑值，有比较运算符或者逻辑运算符，所产生的逻辑值
            //当表达式值为true执行下面的语句
            System.out.println("踏春");
        }

        if(n<1){
            System.out.println("睡觉");
        }*/


    }
}
