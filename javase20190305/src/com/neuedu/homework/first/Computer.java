package com.neuedu.homework.first;

public class Computer {
    private String color;
    private int cpu;
    Computer(){}
    Computer(String color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    void print(){
        System.out.println("笔记本的颜色："+color+",cpu型号："+cpu);
    }
}
