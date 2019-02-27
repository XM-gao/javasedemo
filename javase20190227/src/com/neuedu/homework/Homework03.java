package com.neuedu.homework;

public class Homework03 {
    public static void main(String[] args) {
       for(int i=2;i<=1000;i++){

           int sum=1;
           for(int j=2;j<=i/2;j++){//后面数值都是不满足条件的，
               if(i%j==0){
                   sum+=j;
               }
           }

           if(sum==i){
               System.out.println(i);
           }

       }
    }
}
