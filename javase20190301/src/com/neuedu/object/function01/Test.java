package com.neuedu.object.function01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       ArraryNumber arraryNumber=new ArraryNumber();
       int[] array=new int[10];
       arraryNumber.input(array);//数组中添加数据

       Scanner scanner=new Scanner(System.in);
        System.out.println("输入要查询的值：");
       int num=scanner.nextInt();

       //判断数据是否在数组中存在
       int index= arraryNumber.check(array,array.length,num);//实参

        //输出结果
        arraryNumber.print(array,num,index);

    }
}
