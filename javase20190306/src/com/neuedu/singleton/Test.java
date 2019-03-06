package com.neuedu.singleton;

public class Test {
    public static void main(String[] args) {
       /* Student student=new Student();
        Student student1=new Student();
        System.out.println(student);
        System.out.println(student1);*/
       Singleton singleton=Singleton.getInstance();
       Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
