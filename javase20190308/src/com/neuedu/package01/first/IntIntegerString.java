package com.neuedu.package01.first;

public class IntIntegerString {
    public static void main(String[] args) {
        /**
         * 网页上收集的数据：String类型
         *  例：int
         *      Integer
         *      String
         *      相互转化为例
         */
        // int===>String
          int int2=234;
          String str1=234+"";
          String str2=String.valueOf(int2);
          String str3=Integer.toString(int2);

        //String ==>int

        String str="123";
        int int1=Integer.parseInt(str);

        //Integer ==>String
           Integer i3=new Integer("789");
           String  string1=String.valueOf(i3);

        //String==>Integer
        String str4="123";
        Integer i1=new Integer(str4);
        Integer i2=Integer.valueOf(str4);

    }
}
