package com.neuedu.package01.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        //产生输入流
        //文件类
         File file=new File("javase20190308/src/file.txt");
        //文件字节输入流类
        FileInputStream fis=new FileInputStream(file);

        //输入流导入到Properties对象中
        Properties properties=new Properties();
        properties.load(fis);

        System.out.println(properties.getProperty("name"));

    }
}
