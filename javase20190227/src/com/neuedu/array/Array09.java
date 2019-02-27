package com.neuedu.array;

import java.util.Random;

public class Array09 {
    public static void main(String[] args) {
        int[] array=new int[5];
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }

        System.out.println("未排序之前：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }

        System.out.println();

        //简单选择排序
        for(int i=0;i<array.length-1;i++){//1:趟数 2：应该最小值的位置
             int j=i;//实际存放最小值的下标

            //求最小值的下标
            for(int k=i+1;k<array.length;k++){
                if(array[j] >array[k]){
                    j=k;
                }
            }

            if(j!=i){//不相等时交换
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }

        }



        System.out.println("排序之后：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }

        System.out.println();



    }
}
