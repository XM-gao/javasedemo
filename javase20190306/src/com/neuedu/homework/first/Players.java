package com.neuedu.homework.first;

public class Players {
    private static int sum;
    private Players(){}
    public  static Players create(){
        sum++;
        if(sum<=11){
            return new Players();
        }else{
            return null;
        }

    }
}
