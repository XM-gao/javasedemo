package com.neuedu.singleton;

public class Singleton {
    /**
     * 私有的变量：数据类型：该类类型
     */
    private  static  Singleton instance=new Singleton();//饿汉：变量直接赋值
    //私有的构造器
    private Singleton(){}
    /**
     * 公共的方法方法：返回类型：该类类型
     *    返回唯一的变量
     */

    public  static  Singleton getInstance(){
        return instance;
    }

}
