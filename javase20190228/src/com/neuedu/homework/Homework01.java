package com.neuedu.homework;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        //超市中的商品
        String[] products={"毛巾","脸盆","铅笔","水杯","书包"};
        double[] prices={15,25,50,250,150};
        int[]  stocks={20,50,100,10,30};

        //篮子
        int[] lanzi=new int[products.length];
        int[] number=new int[products.length];
         int k=0;

        Scanner scanner=new Scanner(System.in);
        //篮子的输入
        while(true){
            System.out.println("1：输入商品");
            System.out.println("2：退出");

            System.out.println("输入命令：");
            int n=scanner.nextInt();

            while (!(n==1||n==2)){
                System.out.println("重新输入命令：");
                   n=scanner.nextInt();
            }

            if(n==1){
                //购买的商品
                System.out.println("输入商品名：");
                String  p=scanner.next();


                int pi=-1;
                for(int i=0;i<products.length;i++ ){
                    if(p.equals(products[i])){

                        pi=i;
                        break;
                    }
                }

                if(pi==-1){
                    System.out.println("商品不存在，重新输入");
                    continue;
                }

               //添加到篮子中之前，判断篮子中是否有此商品，如果有，直接修改数量，如果没有，进行添加
                int updatei=-1;
                for(int i=0;i<k;i++){
                    if(lanzi[i]==pi){
                        updatei=i;
                        break;
                    }
                }

                if(updatei==-1){

                    lanzi[k]=pi;
                    //购买数量



                    System.out.println("输入购买商品的数量：");
                    int num=scanner.nextInt();

                     while(!(0<num&& num<=stocks[pi])){
                         System.out.println("重新输入购买商品的数量：");
                         num=scanner.nextInt();
                     }

                     number[k]=num;
                     stocks[pi]=stocks[pi]-num;
                     k++;
                }else {
                    System.out.println("输入购买商品的数量：");
                    int num=scanner.nextInt();

                    while(!(0<num&& num<=stocks[pi])){
                        System.out.println("重新输入购买商品的数量：");
                        num=scanner.nextInt();
                    }

                    number[updatei]=number[updatei]+num;
                    stocks[pi]=stocks[pi]-num;

                }

            }

            if(n==2){
                System.out.println("结束输入");
                break;
            }


        }

   //打印小票
        System.out.println("******************小票打印****************");
        System.out.println("商品名\t单价\t购买数量\t总价");
        int num=0;
        double sum=0;
        for(int i=0;i<k;i++){
            System.out.println(products[lanzi[i]]+"\t"+prices[lanzi[i]]+"\t"+number[i]+"\t\t"+(prices[lanzi[i]]*number[i]));
            sum+=prices[lanzi[i]]*number[i];
            num+=number[i];
        }
        System.out.println("所购买的商品数量："+num);
        System.out.println("一共消费："+sum);

    }
}
