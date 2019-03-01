package com.neuedu.object;

import java.util.Random;

public class ArrayFunction {
    //数组的添加
    void input(int[] array){
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
        }
    }


    //数组的输出
    void ouput(int[] array){
        for(int a:array){
            System.out.print(a+"\t");
        }
        System.out.println();
    }


}
