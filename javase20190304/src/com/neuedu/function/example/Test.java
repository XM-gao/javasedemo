package com.neuedu.function.example;

public class Test {
    public static void main(String[] args) {
        //超市中的商品
        String[] products={"毛巾","脸盆","铅笔","水杯","书包"};
        double[] prices={15,25,50,250,150};
        int[]  stocks={20,50,100,10,30};

        //篮子
        int[] lanzi=new int[products.length];
        int[] number=new int[products.length];
        int k=0;
    ArrayFuncton arrayFuncton=    new ArrayFuncton();
    k= arrayFuncton.menu(products,prices,stocks,lanzi,number,k);
        System.out.println(k);
     arrayFuncton.print(products,prices,lanzi,number,k);

    }
}
