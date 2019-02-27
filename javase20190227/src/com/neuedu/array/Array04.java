package com.neuedu.array;

public class Array04 {
    public static void main(String[] args) {
        //初始化:在定义数组的同时，给定他的值
        //初始化的时候数组长度不用给
       /* int[] array =new int[]{45,12,56,78};*/
       /* int[] array ={45,12,56,78};*/
        int[] array =new int[]{45,12,56,78};
        /**
         *  foreach结构
         *   for(数据类型 变量名:数组名)  变量：依次提取数据中的数组元素
         *   {
         *       操作：只能进行显示:显示的数据元素
         *
         *   }
         */
        for (int a:array) {
            System.out.println(a);
        }

    }
}
