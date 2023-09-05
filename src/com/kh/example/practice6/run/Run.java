package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student();


        student.setGrade(6);
        student.setClassroom(3);
        student.setName("신재헌");
        student.setHeight(176.7);
        student.setGender('남');


        student.information();
    }



}
