package com.neuedu.homowork.second;

public class DepositorController {

    public static void putMonny(Depositor depositor,double monny){
        depositor.setBalance(depositor.getBalance()+monny);
    }

    public static void getMonny(Depositor depositor,double monny){
        if(depositor.getBalance()<monny){
            System.out.println("余额不足");
            return;
        }
        depositor.setBalance(depositor.getBalance()-monny);
    }

    public static void printMonny(Depositor depositor){
        System.out.println(depositor);
    }

}
