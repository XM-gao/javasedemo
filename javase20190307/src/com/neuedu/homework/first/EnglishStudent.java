package com.neuedu.homework.first;

public class EnglishStudent extends Student {
    private double speech;
    private double midexam;
    private double finishexam;

    public  EnglishStudent(int id,String name,String sex,int age,double speech,double midexam,double finishexam){
        super(id,name,sex,age);
        this.speech=speech;
        this.midexam=midexam;
        this.finishexam=finishexam;
        this.insertScore();
    }


    @Override
    public void insertScore() {
        double score=speech*0.5+midexam*0.25+finishexam*0.25;
        super.setScore(score);
    }
}
