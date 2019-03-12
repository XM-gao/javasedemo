package com.neuedu.thread.second;

public class Test {
    public static void main(String[] args) {
        MYRunner runner=new MYRunner();
        Thread thr1=new Thread(runner,"thr1");
        Thread thr2=new Thread(runner,"thr2");
        Thread thr3=new Thread(runner,"thr3");
        thr1.start();
        thr2.start();
        thr3.start();
    }
}
