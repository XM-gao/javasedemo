package com.neuedu.package01.first;

public class PackageImport {
    public static void main(String[] args) {

        Object obj="45";//静态存储：方法区
        Object obj2="78";
        Object obj3=new Object();//动态存储，存在堆内存中

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj2==obj);
        System.out.println(obj );
        System.out.println(obj2);
        System.out.println(obj3);
        /**
         * 1：hashCode()
         * 2：toString()
         * 问题：
         * 1:== 和 equals区别
         *   == 对于基本数据类型 ：比较两个值 如int =34 b=56 ,a==b
         *   == 对于引用数据类型：判断两个对象是否是同一个引用，如果是两个对象是，返回true,否则false
         *
         *   equals：在Object中的方法，功能是判断两个对象是否是同一个引用
         *           可以被子类重写
         *
         */
    }


}
