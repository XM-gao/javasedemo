package com.neuedu.homework;

public class Homework02 {
    public static void main(String[] args) {
        int num=0;//使用num进行计数
        for(int n=101;n<=200;n++){

            boolean flag=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag){
                num++;//只有是素数的时候计入
                System.out.print(n+"\t");

                if(num%10==0){//判断此数是不是10的倍数，如果是，换行
                    System.out.println();
                }

            }




        }
    }
}
