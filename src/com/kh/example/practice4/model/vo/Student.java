package com.kh.example.practice4.model.vo;

public class Student {
    int grade;
    String classroom;
    String name;
    double height;
    String gender;

    public Student(int grade, String classroom, String name, double height, String gender){
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public void information(){

        System.out.println(" 학년 : " + grade);
        System.out.println(" 반 : " + classroom);
        System.out.println(" 이름 : " + name);
        System.out.println(" 키 : " + height);
        System.out.println(" 성별 : " + gender);

    }


}
