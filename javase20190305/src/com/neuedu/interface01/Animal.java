package com.neuedu.interface01;

/**
 * 如果抽象类中只有抽象方法---转换为接口
 *  abastract class-->interface
 *   public abstract 可以省略，默认
 *
 *   接口：关键词是interface
 *        1.7之前： 抽象方法；常量public static final
 *        1.8:抽象方法，常量，static方法，default方法
 *                    static void cry(){

                     }
                     default  void jump(){

                     }
 */
public interface Animal {//接口，
     /*int MAX=45;*/
       void  eat();
       void sleep();

}
