package com.neuedu.array;


import java.util.Random;

public class Array03 {
    public static void main(String[] args) {
        //通过随机数自动生成
        Random random=new Random();//随机数生成:
        int[]  array=new int[5];

        /*System.out.println("输入数据：");*/
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);//随机数在0-100[0,100)
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
