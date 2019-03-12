package com.neuedu.io.serializable;

import com.neuedu.io.entity.Student;

import java.io.*;

public class InputExample {
    public static void main(String[] args) {
        /**
         * 1:文件
         * 2：文件字节输入流--FileInputStream
         * 3：对象字节输入流--ObjectInputStream
         * 4：读
         * 5：关闭
         */
        // 1:文件
        File file=new File("student.txt");
        if(!file.exists()) {
           return;
        }
        //   2：文件字节输入流--FileInputStream
        FileInputStream fis=null;

        //3：对象字节输入流--ObjectInputStream
        ObjectInputStream ois=null;

        try {
            fis=new FileInputStream(file);
            ois=new ObjectInputStream(fis);
            Student student1=(Student) ois.readObject();
            Student student2=(Student) ois.readObject();
            System.out.println(student1);
            System.out.println(student2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            //关闭
            try{
                if(ois!=null){
                    ois.close();
                }
                if(fis!=null){
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
