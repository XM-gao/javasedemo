package com.neuedu.homework.second;

import java.util.Scanner;

public class GTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String name=scanner.next();
        Gardener.create(name);
    }
}
