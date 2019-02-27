package com.neuedu.www.second;

import java.util.Scanner;

public class Controller04 {
    public static void main(String[] args) {
        int score;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入成绩：");
        score=scanner.nextInt();

        //核心代码
        if(score>=0&&score<=100){

            if(score>=90){
                System.out.println("A");
            }else if(score>=80){
                System.out.println("B");
            }else if(score>=70){
                System.out.println("C");
            }else if(score>=60){
                System.out.println("D");
            }else{
                System.out.println("E");
            }


        }else{
            System.out.println("输入有误！");
        }

    }
}
