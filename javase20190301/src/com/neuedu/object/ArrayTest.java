package com.neuedu.object;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayFunction arrayFunction=new ArrayFunction();
        int[] array=new int[5];
        arrayFunction.input(array);
        arrayFunction.ouput(array);
    }
    /**
     * 1: 输入一个数，查找此数是否在数组中存在，如果存在，返回所在位置的下标
     *    12 45 41 2 8 48  44 78
     *    输入2
     *    输出结果：2在数组中存在，下标为3
     *    1)数组--- 随机数
     *       问题：如何保证数据的唯一性
     *
     *       void input(int[] array){
     *             Random random=new Random();
     *             for(int i=0;i<array.length;i++){
     *                 int x=random.nextInt(100);
     *                 if(i==0){
     *                     array[i]=x;
     *                 }else{
     *                     int k=check(array,x)
     *                     if(k==-1){
     *                         array[i]=x;
     *                     }
     *                 }
     *             }
     *
     *       }
     *
     *
     *    2）判断输入的数据是否在数组中存在   返回的下标：-1或者下标
     *      int check(int[] array,int x){
     *           for(int i=0;i<array.length;i++){
     *               if(array[i]==x){
     *                   return i;
     *               }
     *           }
     *           return -1;
     *       }
     *    3）输出结果   参数：数组，和数值，下标
     *
     *      void print(int[] array,int num,int index){
     *          for(int i=0;i<array.length;i++){
     *              System.out.print(array[i]);
     *          }
     *          if(index==-1){
     *             System.out.println("\t数组中不包含"+num)
     *          }else{
     *              System.out.println("\t数组中包含"+num+",下标为："+index)
     *          }
     *      }
     *
     *    自己设计方法
     *2：判断一个数是否是素数
     *    使用方法
     *     boolean fun(int num){
     *         boolean flag=true;
     *         for(int i=2;i<num/2;i++){
     *             if(num%2==0){
     *                 flag=false;
     *                 break;
     *             }
     *         }
     *         return flag;
     *     }
     * 3：读程序，写出结果----传值和传址
     * 传值：对于基本数据类型
     * 传址：对于 数组，引用数据类型 传入的是地址
     *   public static void main(String[] args){
     *    int num=23;
     *    int[] array={12,78,56};
     *
     *      fun(num,array);
     *
     *      System.out.println(num)：23
     *      for(a:array){
     *           System.out.print(a+"\t"):12 78 56
     *      }
     *
     *    }
     *    public static void fun(int num,int[] array){
     *        num=44;
     *       ///array[2]=100;
     *       array=new int[3];
     *       array[2]=100
     *    }
     *
     */
}
