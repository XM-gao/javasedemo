package com.neuedu.first;

import java.util.Scanner;

public class ControllerWhile02 {
    public static void main(String[] args) {
        /**
         *    ***********
         *      1：登录
         *      2：注册
         *      3：退出
         *    ***********
         *    输入命令：1
         *        登录
         *   输入命令：6
         *   重新输入命令：3
         *   byebye
         *
         *
         *
         */
        Scanner scanner=new Scanner(System.in);
      while (true) {
          System.out.println("*******************************");
          System.out.println("\t\t1:登录");
          System.out.println("\t\t2:注册");
          System.out.println("\t\t3:退出");
          System.out.println("*******************************");
          System.out.println("输入命令");
          int n = scanner.nextInt();

          while (!(n >= 1 && n <= 3)) {
              System.out.println("重新输入命令");
              n = scanner.nextInt();
          }

          if (n == 1) {
              System.out.println("登录");
          }
          if (n == 2) {
              System.out.println("注册");
          }

          if (n == 3) {
              System.out.println("退出");
              System.out.println("byebye");
              break;
          }
      }

    }
}
