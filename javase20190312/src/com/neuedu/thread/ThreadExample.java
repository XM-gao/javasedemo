package com.neuedu.thread;

public class ThreadExample {
    /**
     * 1:概念
     *   1）线程：一个程序内部执行的一个顺序的控制流
     *   2）进程：计算机中执行的程序的实体：.class .exe；进程中包含了多个线程
     *   3）程序:包含多个进程
     *
     *  2：进程和线程的区别
     *     进程：每个进程独立使用代码和数据空间，进程的切换有很大的开销
     *     线程：每一类线程共享代码和数据空间，共享栈和程序计算器，线程之间的切换的开销小。
     *
     *  3：实现：
     *     继承Thread
     *     实现Runnable
     *     start()激活线程，到了就绪状态
     * 4:线程的同步
     *    1）方法声明中添加：synchronized
     *    2）代码块中
     *        synchronized (Object obj )
     *
     */
}
