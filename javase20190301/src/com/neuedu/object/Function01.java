package com.neuedu.object;

public class Function01 {
    /**
     * 方法中--无参无返回值
     */
    void  eat1(){
        System.out.println("馒头，白菜");
    }

    /**
     * 方法中--无参有返回值
     */
    String eat2(){
        return "豆浆";
    }

    /**
     * 方法中--有参有返回值
     */
    String eat3(String e){
        String cs="张三";
        return cs+e;
    }
    /**
     * 方法中--有参无返回值
     */
    void eat4(String e){
        System.out.println("上菜："+e);
    }
}
