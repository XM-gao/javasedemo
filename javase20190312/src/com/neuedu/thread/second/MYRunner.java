package com.neuedu.thread.second;

public class MYRunner implements Runnable {

    static int n = 20;

    /**
     * Thread.currentThread().getName():提取当前线程，提取线程名
     */
    @Override
    public void run() {

        for (; ; ) {
            synchronized (this) {
                if (n <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ":" + n--);
                try {
                    Thread.sleep(300L);//毫秒 long
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
