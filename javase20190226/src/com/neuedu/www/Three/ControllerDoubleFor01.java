package com.neuedu.www.Three;

public class ControllerDoubleFor01 {
    public static void main(String[] args) {
        /**
         * 思路：
         *  1：设置一个for 行数 从1到9
         *  2：每一行：
         *        for 从1到行数
         *   3： 表达式
         *
         */
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        /**
         *
         *
         *
         *
         */


    }
}
