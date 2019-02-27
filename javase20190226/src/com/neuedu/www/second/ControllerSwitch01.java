package com.neuedu.www.second;

import java.util.Scanner;

public class ControllerSwitch01 {
    public static void main(String[] args) {
        int score;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入成绩");
        score=scanner.nextInt();

        //提取十位上的数
        int n=score/10;

        switch (n){
            case 10:

            case 9:
                System.out.println("A");break;
            case 8:
                System.out.println("B");break;
            case 7:
                System.out.println("C");break;
            case 6:
                System.out.println("D");break;
                default:
                    System.out.println("E");
        }

    }
}
