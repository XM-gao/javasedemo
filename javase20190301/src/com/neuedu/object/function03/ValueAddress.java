package com.neuedu.object.function03;

public class ValueAddress {
    public static void main(String[] args) {
        int num = 23;
        int[] array = {12, 78, 56};

        fun(num, array);

        System.out.println(num);
        for (int a : array) {
            System.out.print(a + "\t");
            ;
        }

    }

    public static void fun(int num, int[] array) {
        num = 44;
        array=new int[3];
        array[2] = 100;
    }

}
