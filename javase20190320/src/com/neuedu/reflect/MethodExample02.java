package com.neuedu.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExample02 {
    public static void main(String[] args) throws Exception {
        //通过放射实现方法的调用
        //1:实例化
        Class<?> studentclass=Class.forName("com.neuedu.entity.Student");
        //2：提取方法
        /**
         * 第一个参数：方法名
         * 从第二个开始的参数的Class类对象
         */
        Method method= studentclass.getMethod("setName",String.class);
        //3:执行方法
        /**
         *  第一个参数：Student对象
         *  从第二个开始的参数：实际值
         */
        Object obj=studentclass.newInstance();
       /*Object setreturn=*/ method.invoke(obj,"tom");
       /* System.out.println(setreturn);*/

        //2：提取方法
        /**
         * 第一个参数：方法名
         * 从第二个开始的参数的Class类对象，无参的时候，不用添加
         */
        Method methodget= studentclass.getMethod("getName");
        //3:执行方法
        /**
         *  第一个参数：Student对象
         *  从第二个开始的参数：实际值,不用添加
         */
       Object getReturn= methodget.invoke(obj);
        System.out.println(getReturn);
    }
}
