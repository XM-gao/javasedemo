package com.neuedu.io.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputExample {
    public static void main(String[] args) {
        /**
         * 1:文件
         *    输入（读），文件必须存在
         *  2：文件字节输入流
         *    FileInputStream
         *  3：读
         *      从文件中读数据
         *      1）一个字节一个字节的读
         *      2） 批量读 ：数组
         *   4：输出结果，控制台
         *
         *   5：关闭
         *
         *
         *
         */
        //1:文件
        File file=new File("file02.txt");
        if(!file.exists()){//不存在结束程序
            return;
        }

        //2：文件字节输入流

        FileInputStream fis=null;

        try {
            fis=new FileInputStream(file);
       /*     //读
            int b=fis.read();
            //输出结果
            System.out.println((char)b);*/

           byte[] b=new byte[1024];
           int len=fis.read(b);//len：实际的b的数据长度

            System.out.println(new String(b,0,len));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }



}
