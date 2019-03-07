package com.neuedu.exception;

public class TryCatchDoubleExample {
    public static void main(String[] args) {
/**
 *   try{//可能发生的异常语句
 *
 *   }catch(ArrayIndexOutOfBoundsException e){//捕获的异常：异常类型 异常名
 *       处理：
 *       System.out.println("此处有异常："+e);
         System.out.println("异常信息："+e.getMessage());
         e.printStackTrace();
 *   }
 *
 *
 *   如果发生多个异常，在处理的时候，
 *        如果异常时平级，catch后面随意写
 *        否则：先写小异常，在写范围大的异常
 *          例如：ArrayIndexOutOfBoundsException，RuntimeException，Exception
 */
        int[] array=new int[5];
       try {
           array[5] = 45;
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("此处有异常："+e);
           System.out.println("异常信息："+e.getMessage());
            e.printStackTrace();

       }catch (RuntimeException e){
           System.out.println(e);
       }

        System.out.println("异常处理完成之后");
    }
}
