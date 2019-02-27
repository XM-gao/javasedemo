package com.neuedu.www.Three;

import java.util.Scanner;

public class ControllerFor02 {
    public static void main(String[] args) {
        //2：判断一个输入的数值是否是质数
        //什么是质数？ 能够被1和本身整除的数，就是质数

        int n;

        Scanner scanner=new Scanner(System.in);
        System.out.println("输入的一个数：");
        n=scanner.nextInt();

        boolean flag=true;//是质数

        //核心代码
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;//不是质数
                break;//当判断出不是质数的时候，不用执行下面的程序
            }
        }

        if(flag){
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }


    }
}
