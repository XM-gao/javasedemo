package com.neuedu.io.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExample {
    public static void main(String[] args) {
        //输出数据到文件file02.txt中 输入内容：abcd123456
        //字节流
        /**
         * 1：文件
         *     文件是否存在，不用管，如果不存在会自动创建
         *      但是，在有些程序中创建，
         * 2：生成输出流  ---文件字节输出流
         *     FileOutputStream
         * 3：数据：字符串===》字节
         *
         * 4：数据输出到文件中
         *
         * 5：关闭 流 ：从里往外关
         */

        //1：文件
        File file=new File("file02.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //2:输入流

        FileOutputStream fos=null;

        try {
            fos=new FileOutputStream(file);
            String str="abcd123456";
            //3：数据：字符串===》字节
            byte[] bytes=str.getBytes();
            //数据输出到文件中
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //5：关闭 流 ：从里往外关
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
