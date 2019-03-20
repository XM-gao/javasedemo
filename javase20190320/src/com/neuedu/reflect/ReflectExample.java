package com.neuedu.reflect;

public class ReflectExample {
    /**
     * 1:反射：是java进行自我管理类、对象等的机制
     * 2：作用：通过放射机制发现对象的类型，如方法，属性，构造器等
     *          并且通过这个对象访问方法和属性等。
     *  3：Class加载：就是把类文件加载到内存中，成为一个对象（实例化），Class类的实例化
     *    基本数据类型
     *
     *    引用数据类型
     *    4: 对方法、属性、构造器的访问。
     * */
    public static void main(String[] args) {
        //基本数据类型
        Class<?> cla01=int.class;
        System.out.println(cla01);
        System.out.println("--------------------------------");
        //引用数据类型
        Class<?> cla02=String.class;

        System.out.println(cla02);
        System.out.println("*********************");
        try {
            Class<?> cla03=Class.forName("java.lang.Runnable");
            System.out.println(cla03);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("*********************");
        String string=new String("dddd");
        Class<?> cla04=string.getClass();
        System.out.println(cla04);

    }




}
