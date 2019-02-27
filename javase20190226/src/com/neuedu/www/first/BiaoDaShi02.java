package com.neuedu.www.first;

public class BiaoDaShi02 {
    public static void main(String[] args) {
        int a=34;
        int b=4;
      /*    b+=a; *///b=b+a
   /*     System.out.println(a);
        System.out.println(b);*/
      /*  int c=5;
      c*=a+b;//c=c*(a+b)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

      b+=a++;
        System.out.println(a);//35
        System.out.println(b);//38

    }
}
