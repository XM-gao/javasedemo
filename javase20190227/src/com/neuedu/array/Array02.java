package com.neuedu.array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //通过控制台输入数据
        Scanner scanner=new Scanner(System.in);//定义一次
        int[]  array;
        array=new int[5];
        System.out.println("输入数据：");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
