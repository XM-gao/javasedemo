package com.neuedu.singleton01;

public class Singleton {

    private static Singleton instance;
    private Singleton(){}
    public static  synchronized Singleton getInstance(){//懒汉模式
        if(instance==null){
            instance=new Singleton();
        }

        return instance;
    }
}
