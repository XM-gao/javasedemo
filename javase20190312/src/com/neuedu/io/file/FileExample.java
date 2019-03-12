package com.neuedu.io.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file=new File("file01.txt");
       // System.out.println("file.exists()："+file.exists());//判断文件是否存在
       /* if(file.exists()){
            file.delete();//删除文件
        }else{
            try {
                file.createNewFile();//创建文件：异常的处理
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        System.out.println("文件的大小："+file.length());
        System.out.println("文件名："+file.getName());


    }
}
