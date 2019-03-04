package com.neuedu.function.example;

import java.util.Scanner;

public class ArrayFuncton {
    Scanner scanner=new Scanner(System.in);
    int menu(String[] products,double[] prices,int[] stocks,int[] lanzi,int[] number,int k){
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
              k= buy(products,prices,stocks,lanzi,number,k);
            }
            if(n==2){
                System.out.println("结束输入");
                break;
            }


        }
        return k;
    }

    int buy(String[] products,double[] prices,int[] stocks,int[] lanzi,int[] number,int k){
        //购买的商品
        System.out.println("输入商品名：");
        String  p=scanner.next();

         int pi=checkProduct(products,p);

        if(pi==-1){
            System.out.println("商品不存在，重新输入");
            return k;
        }
        //添加到篮子中之前，判断篮子中是否有此商品，如果有，直接修改数量，如果没有，进行添加
        int updatei=checkLanzi(lanzi,k,pi);

        if(updatei==-1){
         k=add(lanzi,pi, k,number,stocks);

        }else {

         update(stocks,pi,number,updatei);
        }
      return k;
    }

    int checkProduct(String products[],String p){
        int pi=-1;
        for(int i=0;i<products.length;i++ ){
            if(p.equals(products[i])){

                pi=i;
                break;
            }
        }
        return pi;
    }

    int checkLanzi(int[] lanzi,int k,int pi){
        int updatei=-1;
        for(int i=0;i<k;i++){
            if(lanzi[i]==pi){
                updatei=i;
                break;
            }
        }
        return updatei;
    }

    int add(int[] lanzi,int pi,int k,int[] number,int stocks[]){
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
        return k;
    }

    void update(int[] stocks,int pi,int[] number,int updatei){
        System.out.println("输入购买商品的数量：");
        int num=scanner.nextInt();

        while(!(0<num&& num<=stocks[pi])){
            System.out.println("重新输入购买商品的数量：");
            num=scanner.nextInt();
        }

        number[updatei]=number[updatei]+num;
        stocks[pi]=stocks[pi]-num;
    }



    void print(String[] products,double[] prices,int[] lanzi,int[] number,int k){
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
