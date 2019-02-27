package com.neuedu.array;

public class Array10 {
    public static void main(String[] args) {
        String str="牙刷";
        String[] strs={"毛巾","牙膏"};
        for(String s:strs){
            if(str.equals(s)){
                System.out.println("有这个商品");
            }
        }

    }
}
