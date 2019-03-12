package com.neuedu.thread.first;

public class ThreadExample01 extends Thread {
    /**
     * 一个方法：run()
     * 实现多线程，必须写的
     */
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("thread:"+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
