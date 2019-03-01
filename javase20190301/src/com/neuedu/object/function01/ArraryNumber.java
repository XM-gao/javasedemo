package com.neuedu.object.function01;

import java.util.Random;

public class ArraryNumber {
    void input(int[] array){
                 Random random=new Random();//alt+enter
                  for(int i=0;i<array.length;i++){
                    int x=random.nextInt(100);
                     if(i==0){
                         array[i]=x;
                     }else{
                         int k=check(array,i,x);
                               if(k==-1){
                             array[i]=x;
                          }
                    }
               }

    }


    int check(int[] array,int length,int x){//形参
                for(int i=0;i<length;i++){
                   if(array[i]==x){
                       return i;
                   }
               }
               return -1;
    }

    void print(int[] array,int num,int index){
               for(int i=0;i<array.length;i++){
                  System.out.print(array[i]+"\t");
              }
              if(index==-1){
                 System.out.println("\t数组中不包含"+num);
                            }else{
                 System.out.println("\t数组中包含"+num+",下标为："+index);
                          }
    }


}
