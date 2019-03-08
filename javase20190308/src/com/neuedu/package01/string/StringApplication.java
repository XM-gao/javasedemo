package com.neuedu.package01.string;

public class StringApplication {
    public static void main(String[] args) {
        String str="123-456-789-456-789-456";
        split(str);
        System.out.println("*************************");
        System.out.println(indexof(str,"456"));
        System.out.println("*************************");
        System.out.println(lastindexof(str,"456"));
        System.out.println("*************************");
        length(str);
        System.out.println("*************************");
        stringtochar(str);
    }

    /***
     * 1:一个字符实现拆分成多个字符串
     * 如：123-456-789
     *     123
     *     456
     *      789
     */
    public static void split(String str){
        String[] strings=str.split("-");
       /* System.out.println(strings);*/
       for(String s:strings){
           System.out.println(s);
       }
    }

    /**
     * 2:查找456是否在这个字符串中，如果有就返回下标 ，返回的是第一个相同字符串的下标
     */
    public  static int indexof(String str,String substr){
       return  str.indexOf(substr);
    }

    /**
     * 3:查找456是否在这个字符串中，返回的是最后一个相同字符串的下标
     */

    public  static int lastindexof(String str,String substr){
        return  str.lastIndexOf(substr);
    }
    /**
     * 4:字符串的长度:方法
     */
    public  static void length(String str){
        System.out.println(str.length());
    }
    /**
     * 5:把字符串转换为char类型
     */
    public static  void stringtochar(String str){
        char chs[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            chs[i]=str.charAt(i);
        }

        for(char c:chs){
            System.out.println(c);
        }
    }

}
