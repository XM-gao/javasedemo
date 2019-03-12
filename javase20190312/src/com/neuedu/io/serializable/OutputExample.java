package com.neuedu.io.serializable;

import com.neuedu.io.entity.Student;

import java.io.*;

public class OutputExample {
    public static void main(String[] args) {

        /**
         * 1:文件
         * 2：文件字节输出流--FileOutputStream
         * 3：对象字节输出流--ObjectOutputStream
         * 4：创建对象：1-2
         * 5：存放到文件中
         * 6：关闭
         */
        //1:文件
        File  file=new File("student.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //2：文件字节输出流--FileOutputStream

        FileOutputStream fos=null;
        //3：对象字节输出流--ObjectOutputStream
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream(file);
            oos=new ObjectOutputStream(fos);
            //4：创建对象：2
            Student student1=new Student(112,"tom");
            Student student2=new Student(4567,"lili");
            //5：存放到文件中
            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //6：关闭
            try {
                if(oos!=null){
                    oos.close();
                }
                if(fos!=null){
                    fos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
