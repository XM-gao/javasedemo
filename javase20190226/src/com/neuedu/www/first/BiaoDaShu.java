package com.neuedu.www.first;

public class BiaoDaShu {
    public static void main(String[] args) {
        //%/
      /*  int a=-45;
        int b=-4;
        System.out.println(a/b);
        System.out.println(a%b);*/
        //++  --
        int a=34;
        //int b=a++;// b=a;a=a+1
       /* System.out.println(a);
        System.out.println(b);*/
      /*  int c=++a;// a=a+1;c=a
        System.out.println(a);
        System.out.println(c);*/
       int b=4;
      /* int c=a+++b;//c=(a++)+b   a=35 b=4 c=38
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
      int c=(a++)+b+(++a);//a=36 b=4 c=74
        //a=a+1;c=a+b+a;a=a+1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
