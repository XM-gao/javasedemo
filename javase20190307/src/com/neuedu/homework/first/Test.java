package com.neuedu.homework.first;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
      /*  Student student=new EnglishStudent(10012,"tom","m",22,89,85,98);
        Student student1=new ChinaStudent(10012,"tom","m",22,89,90,85,98);

        System.out.println(student1);*/

      Student[] students=new Student[5];
        Random random=new Random();
        for(int i=0;i<students.length;i++){
            int k=random.nextInt(2);
            if(k==0){
                students[i]=new EnglishStudent(10012+i,"tom","m",19+random.nextInt(4),60+random.nextInt(41),60+random.nextInt(41),60+random.nextInt(41));
            }else if(k==1){
                students[i]=new ChinaStudent(10078+i,"tom"+i,"m",19+random.nextInt(4),60+random.nextInt(41),60+random.nextInt(41),60+random.nextInt(41),60+random.nextInt(41));

            }
        }
        for (Student student:students
             ) {
            System.out.println(student);
        }

    }
}
