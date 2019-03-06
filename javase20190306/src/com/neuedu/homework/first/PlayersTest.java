package com.neuedu.homework.first;

public class PlayersTest {
    public static void main(String[] args) {
        while (true){
            Players players=Players.create();
            if(players==null){
                System.out.println("对不起，已经创建了11对象，不能再创建对象了");
                break;
            }

            System.out.println("创建了一个对象");
        }
    }
}
