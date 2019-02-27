package com.neuedu.array;

import java.util.Random;

public class Array06 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }

        int sum=array[0];
        int maxValue=array[0];
        for(int i=1;i<array.length;i++){//求和  求最大值
            sum+=array[i];
            if(maxValue<array[i]){
                maxValue=array[i];
            }
        }

        int avg=sum/array.length;


        for (int a:array
                ) {
            System.out.print(a+"\t");
        }
        System.out.println("\n数组的平均值为："+avg+",最大值为："+maxValue);


        /**
         * 1:求最小值及其最小值的下标
         */
    }
}
