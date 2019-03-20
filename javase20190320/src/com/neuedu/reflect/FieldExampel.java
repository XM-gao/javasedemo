package com.neuedu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 通过放射提取Class类对象的属性
 */
public class FieldExampel {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class类的实例化
        Class<?> studentclass=Class.forName("com.neuedu.entity.Student");

       //Field[] fields= studentclass.getDeclaredFields();//全部字段

        Field[] fields= studentclass.getFields();//公共的字段
        for(Field f:fields){
            System.out.println(f.getModifiers()+" "+Modifier.toString(f.getModifiers())+" "+f.getType()+"  "+f.getName());
        }
    }
}
