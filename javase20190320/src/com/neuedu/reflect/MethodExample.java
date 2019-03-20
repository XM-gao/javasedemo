package com.neuedu.reflect;

import java.lang.reflect.Method;

public class MethodExample {
    public static void main(String[] args) throws ClassNotFoundException {
      Class<?> studentClass=Class.forName("com.neuedu.entity.Student");

      //提取方法

       Method[] methods= studentClass.getDeclaredMethods();

       //显示
       for(Method m:methods){
           System.out.println(m.getReturnType()+"    " +m.getName());
           Class<?>[] pas=m.getParameterTypes();
           for(Class<?> p:pas){
               System.out.println("----"+p);
           }
       }

    }
}
