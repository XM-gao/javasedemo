package com.neuedu.homework.first;

public class ChinaStudent extends Student {
    private double speech;
    private double works;
    private double midexam;
    private double finishexam;

    public ChinaStudent(int id, String name, String sex, int age, double speech,double works, double midexam, double finishexam){
        super(id,name,sex,age);
        this.speech=speech;
        this.works=works;
        this.midexam=midexam;
        this.finishexam=finishexam;
        this.insertScore();
    }


    @Override
    public void insertScore() {
        double score=speech*0.35+works*0.35+midexam*0.15+finishexam*0.15;
        super.setScore(score);
    }
}
