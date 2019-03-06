package com.neuedu.homework.three;

public class HourlyExmployee extends ColaEmployee {
      private int hour;
      private  double salaryHour;

      public HourlyExmployee(String name,int birthdayMonth,int hour,double salaryHour){
          super(name,birthdayMonth);
          this.hour=hour;
          this.salaryHour=salaryHour;
      }
    @Override
    public double getSalary(int birthdayMonth) {
          //先计算hour小时多少工资
          double salary=0;
          if(hour<160){
              salary=salaryHour*hour;
          }else{
              salary=salaryHour*160+salaryHour*1.5*(hour-160);
          }

          //是否有奖励
          if(birthdayMonth==super.getBirthdayMonth()){
              return salary+100;
          }

        return salary;
    }
}
