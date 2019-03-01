package com.neuedu.object;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayFunction arrayFunction=new ArrayFunction();
        int[] array=new int[5];
        arrayFunction.input(array);
        arrayFunction.ouput(array);
    }
    /**
     * 1: 输入一个数，查找此数是否在数组中存在，如果存在，返回所在位置的下标
     *    12 45 41 2 8 48  44 78
     *    输入2
     *    输出结果：2在数组中存在，下标为3
     *
     *    自己设计方法
     *
     */
}
