package com.neuedu.array;

import java.util.Random;

public class Array08 {
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

        //进行排序--冒泡排序

        for(int i=0;i<array.length-1;i++){//比较的趟数

            for(int j=0;j<array.length-i-1;j++){//i:不参与比较的数有几个
                    if(array[j] >array[j+1]){
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
            }

        }



        System.out.println("排序之后：");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }

        System.out.println();


    }
}
