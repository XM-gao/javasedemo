package com.neuedu.io.img;

import java.io.*;

public class ImgCopyExample {
    public static void main(String[] args) {
        File file=new File("e:/timg.jpg");//绝对路径
        /*System.out.println(file.getName());*/


        //创建目标文件的目录和文件
        File dDir=new File("E:\\img");//目标路径--目录
        if(!dDir.exists()){
            dDir.mkdir();
        }

        File dFile=new File(dDir,file.getName());//文件
        if(!dFile.exists()){
            try {
                dFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileInputStream fis=null;

        FileOutputStream fos=null;

        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;


        try {
            fis=new FileInputStream(file);
            fos=new FileOutputStream(dFile);
           //提高速度，
           bis=new BufferedInputStream(fis);
           bos=new BufferedOutputStream(fos);

            byte[] bytes=new byte[1024];
            int len=0;
            /*while((len=fis.read(bytes))!=-1){
                *//*System.out.println(new String(bytes,0,len));*//*

                fos.write(bytes,0,len);

            }
            fos.flush();*/

            while((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);

            }
            bos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bos!=null){
                    bos.close();
                }
                if(bis!=null){
                    bis.close();
                }
                 if(fos!=null){

                    fos.close();
                  }
                  if(fis!=null){
                     fis.close();
                  }
            } catch (IOException e) {
            e.printStackTrace();
        }
        }


    }
}
