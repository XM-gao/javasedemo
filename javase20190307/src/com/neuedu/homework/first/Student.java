package com.neuedu.homework.first;

public abstract class Student {
    private int id;
    private String name;
    private String sex;
    private int age;
    private double score;

    public Student(int id,String name,String sex,int age){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public void setScore(double score){
        this.score=score;
    }
    public double getScore(){
        return score;
    }

    public abstract  void insertScore();

    @Override
    public String toString() {
        return "学号："+id+" 姓名："+name+" 性别："+sex+" 年龄："+age+" 成绩："+score;

    }
}
