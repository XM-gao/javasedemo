package com.neuedu.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class DoubleArray01 {
    public static void main(String[] args) {
        int[][] array=new int[3][4];
        //int[][] array=new int[][]{{12,45},{78},{23}};
        /**
         * 上面的数组，定义了3*4个元素
         *
         */

        Random random=new Random();
        for(int i=0;i<array.length;i++){
             for(int j=0;j<array[i].length;j++){
                 array[i][j]=random.nextInt(100);
             }
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print( array[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
