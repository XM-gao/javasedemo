package com.neuedu.static01;

public class StaticExample01 {
    int age=0;
     static int height=0;

    {
        System.out.println("代码块");
    }
    static{//静态代码块
        System.out.println("static代码块");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        StaticExample01.height = height;
    }



}
