package com.neuedu.array;

public class Array01 {
    public static void main(String[] args) {
        /**
         * 数组定义：
         * 数据类型[] 数组名;(推荐)
         * 数据类型 数组名[] ;
         *  创建：
         *  关键字：new
         *     数组名=new 数据类型[数组的长度];
         *
         *   存放数据和提取数据
         *   -- 数组元素：数组名[下标] 下标：0-数组长度-1
         *    单个元素的存取
         *    整体存取:
         *
         *    数组的长度可以使用数组名的属性实现--数组名.length
         */

        int[]  array;
        array=new int[5];

     /*   array[0]=34;
        array[3]=12;
        System.out.println(array[0]);
        System.out.println(array[2]);*/
       for(int i=0;i<array.length;i++){
           array[i]=i+1;
       }

       for(int i=0;i<array.length;i++){
           System.out.println(array[i]);
       }

    }
}
