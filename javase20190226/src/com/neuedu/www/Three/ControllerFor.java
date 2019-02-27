package com.neuedu.www.Three;

public class ControllerFor {
    public static void main(String[] args) {
        //1+2+...+100
        /**
         *   i：1）从1，变换到100
         *      2)趋于结束的条件
         *   sum:存入sum，进行加法统计
         *
         *   i=1;
         *   sum=0;
         *   sum+=i;===> sum=1;i=i+1=2;
         *   sum+=i;===> sum=3;i=i+1=3;
         *   ....    ===>sum=...;i=i+1=100
         *   sum+=i;===>sum=5050;i=i+1=101
         */
        int sum=0;
        /**
         *  1:执行第一个参数：int i=1：主要用于给趋于结束变量赋值
         *  2：执行第二个参数：i<=100：判断语句，满足什么条件执行循环体，执行第三步
         *  ；不满足退出循环体，结束
         *  3：执行循环体中语句：sum+=i;
         *  4：执行第三个参数：i++ ，趋于结束，执行第二步
         */
       /* for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);*/
        int i=1;//第一个参数
        for(;;){
            if(i>100){//代替for的第二个参数i<=100
                break;//跳出循环体
            }
            sum+=i;
            i++;//第三个参数
        }
        System.out.println(sum);
        /**
         * 1：1到100的偶数之和
         * 2：判断一个输入的数值是否是质数
         *
         */
    }
}
