package com.neuedu.package01.first;

public class Object01 {
    /**
     *   byte  short   int  long  float double char boolean
     *   Byte  Short Integer Long Float  Double Character Boolean
     *   包装类：以int 和Integer例进行讲解
     *          区别：1：int 默认值0  Integer 默认值 null
     *                2：Integer提供了方法
     *                3:Integer 以int为底层 ， 自动装箱和拆箱
     *
     */

    public static void main(String[] args) {
       /* Integer integer=new Integer(45);
        int int1=45;*/
        Integer integer=128;//自动完成装箱:-128到127对象相同，但是其他对象不同
        int int1=integer;//自动拆箱
        Integer integer1=128;

        Integer integer2=new Integer(127);
        Integer integer3=new Integer(127);
        System.out.println(integer2==integer3);
        System.out.println(integer2.equals(integer3));



    }
}
