package com.neuedu.homowork.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DepositorTest {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {


        HashMap<String,Depositor> hashMap=new HashMap<>();
        create(hashMap);
       menu(hashMap);



    }
    public static void  menu(HashMap<String,Depositor> hashMap){
        while(true){
            System.out.println("1:输入账号");
            System.out.println("2:退出");
            System.out.println("输入命令");
            int n=scanner.nextInt();

            if(n==1) {
                //1:输入账号
                System.out.println("输入账号");
                String id=scanner.next();

                if(hashMap.containsKey(id)){
                    //2:对账号操作
                    Depositor depositor=hashMap.get(id);
                    while(true) {
                        System.out.println("1:存钱");
                        System.out.println("2:取钱");
                        System.out.println("3:输出余额");
                        System.out.println("4:退出");
                        int dn=scanner.nextInt();
                        if(dn==1){
                            System.out.println("输入要存的钱数：");
                            double monny=scanner.nextDouble();
                            DepositorController.putMonny(depositor,monny);
                        }

                        if(dn==2){
                            System.out.println("输入要取的钱数：");
                            double monny=scanner.nextDouble();
                            DepositorController.getMonny(depositor,monny);
                        }
                        if(dn==3){

                            DepositorController.printMonny(depositor);
                        }
                        if(dn==4) {
                            System.out.println("退出");
                            break;
                        }


                    }

                }else{
                    System.out.println("账号输入有误");
                }



            }
            if(n==2) {
                System.out.println("退出");
                break;
            }
        }

    }


    public static void create(HashMap<String,Depositor> hashMap){
        Depositor depositor1=new Depositor("12345678912","tom",4000.0);
        Depositor depositor2=new Depositor("45645678919","zhang",0.0);
        Depositor depositor3=new Depositor("78945678917","ku",12.0);
        Depositor depositor4=new Depositor("96345678915","lili",30.0);
        hashMap.put(depositor1.getId(),depositor1);
        hashMap.put(depositor2.getId(),depositor2);
        hashMap.put(depositor3.getId(),depositor3);
        hashMap.put(depositor4.getId(),depositor4);
    }
}
