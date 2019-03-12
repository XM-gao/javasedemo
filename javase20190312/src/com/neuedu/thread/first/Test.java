package com.neuedu.thread.first;

public class Test {
    public static void main(String[] args) {

        ThreadExample01 threadExample01=new ThreadExample01();
        threadExample01.start();
        for(int i=0;i<20;i++){
            System.out.println("main:"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
