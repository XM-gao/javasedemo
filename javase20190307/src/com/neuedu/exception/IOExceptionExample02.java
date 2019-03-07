package com.neuedu.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExceptionExample02 {
    public static void main(String[] args) {
        File file=new File("c://kk.txt");

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(file);
            System.out.println(fos);
            fos.write(45);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("上面的代码是否发生异常，不管，但是finally里面内容都要执行");
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(fos);
    }
}
