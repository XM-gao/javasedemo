package com.neuedu.array;

import java.util.Random;

public class Array07 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }

        int minValue=array[0];//存放最小值
        int min_i=0;//存放最小值的下标

        for (int i = 1; i < array.length; i++) {
            if(minValue>array[i]){
                minValue=array[i];
                min_i=i;
            }
        }
        for (int a:array
             ) {
            System.out.print(a+"\t");
        }
        System.out.println("\n数组的最小值为："+minValue+"，最小值下标为："+min_i);


    }
}
