package com.neuedu.array;

import java.util.Random;

public class Array05 {
    public static void main(String[] args) {
        //定义一个数组，求数组数据的平均值，最大值
        /**
         * 1:定义数组，并赋值
         *     通过随机方法赋值
         *  2：平均值
         *      求和
         *      再求均值
         *  3：设定一个值maxValue=数组的第一个值
         *      和数组中的每一个其他数组元素比较，当maxValue小于其他数组元素，maxValue=数组元素
         *   4：输出结果
         */

        int[] array=new int[10];
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }

        int sum=0;
        for (int a:array) {
            sum+=a;
        }
        int avg=sum/array.length;


        int maxValue=array[0];
        for(int i=1;i<array.length;i++){
            if(maxValue<array[i]){
                maxValue=array[i];
            }
        }

        for (int a:array
             ) {
            System.out.print(a+"\t");
        }
        System.out.println("\n数组的平均值为："+avg+",最大值为："+maxValue);


    }
}
