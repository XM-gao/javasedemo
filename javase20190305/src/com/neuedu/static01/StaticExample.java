package com.neuedu.static01;

public class StaticExample {
    /**
     * static修饰符
     *     成员变量-- static静态变量或者类变量
     *             -- 实例变量
     *     方法---static静态方法
     *         ---实例方法
     *
     * static静态的特点：
     *          1.随着类的加载而加载。
     *          2.被所用对象共享。
     *          3.优先于对象存在。
     *          4.可以被类名调用 ，对象调用
     *          5.静态变量可以使用get、set方法 特有的数据用成员变量，多个对象共用的数据用静态变量
     *
     *          静态方法中使用静态的变量和方法，不能使用this、super调用
     *          实例方法，可以使用静态，非静态的元素，this、super调用
     */
}
