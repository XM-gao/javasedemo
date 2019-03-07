package com.neuedu.exception;

public class ThrowsExceptionExample {


    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        int[] array=new int[5];

        array[5]=45;

        System.out.println("异常处理完成之后");
    }
}
