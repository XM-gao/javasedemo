package com.neuedu.exception;

public class TryCatchExample {
    public static void main(String[] args) {
/**
 *   try{//可能发生的异常语句
 *
 *   }catch(ArrayIndexOutOfBoundsException e){//捕获的异常：异常类型 异常名
 *       处理：
 *       System.out.println("此处有异常："+e);
         System.out.println("异常信息："+e.getMessage());
         e.printStackTrace();
 *   }finally{
 *       无论有无异常都要执行，
 *        return：也要执行
 *         System.exit(0)：不执行
 *         一般就是关闭参数，或者执行一些无论有无异常都要执行
 *   }
 *
 *   处理完成之后，后面的代码不受影响
 *
 */
        int[] array=new int[5];
       try {
           array[4] = 45;
          /* return;*/
          System.exit(0);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("此处有异常："+e);
           System.out.println("异常信息："+e.getMessage());
            e.printStackTrace();

       }finally {
           System.out.println("必须执行的");
       }

        System.out.println("异常处理完成之后");
    }
}
