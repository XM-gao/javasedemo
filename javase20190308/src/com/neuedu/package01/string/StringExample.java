package com.neuedu.package01.string;

public class StringExample {
    /**
     * 1:String StringBuffer StringBuilder区别
     * String :字符串不可变的 :final char value[]; 存储数据的value是常量数组
     * StringBuffer 、StringBuilder：字符串可变
     *     StringBuffer：线程安全，性能低，适合多线程
     *     StringBuilder 1.5 之后存在，性能块，线程不安全，适合单线程
     * @param args
     */
    public static void main(String[] args) {
   /*    String  str="123";
       String str1="123";
       String str2=new String("123");
        System.out.println(str==str1);
        System.out.println(str1==str2);*/

       /* String str3=new String("123")+new String("123");
        String str4="123123";
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));*/




    }
}
