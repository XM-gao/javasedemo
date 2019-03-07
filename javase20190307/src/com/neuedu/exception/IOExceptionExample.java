package com.neuedu.exception;

import java.io.File;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {

        File file=new File("c://kk.txt");
        if(!file.exists()){
            try {
                file.createNewFile();//检查异常，必须做处理
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
