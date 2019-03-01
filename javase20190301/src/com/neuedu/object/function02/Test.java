package com.neuedu.object.function02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数值：");
        int n=scanner.nextInt();

       boolean fl=  new SuShu().fun(n);//匿名调用

        if(fl){
            System.out.println(n+"是素数");
        }else{
            System.out.println(n+"不是素数");
        }

    }
}
