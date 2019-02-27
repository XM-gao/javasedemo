package com.neuedu.www.Three;

public class ControllerFor01 {
    public static void main(String[] args) {
        int sum=0;
      /*  for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }*/
      /*  for(int i=0;i<=100;i=i+2){
                sum+=i;
        }*/

        for(int i=1;i<=100;i++){
            if(i%2!=0){
                continue;//结束本次循环
            }
            sum+=i;
        }


        System.out.println("sum="+sum);
    }
}
