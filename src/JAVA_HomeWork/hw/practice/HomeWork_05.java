package JAVA_HomeWork.hw.practice;

import java.util.Scanner;

public class HomeWork_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bNum = 3.0;
        String score = " ";
        System.out.print("이름 : " );
        String name = sc.next();
        System.out.print("학년 : ");
        int year = sc.nextInt();
        System.out.print("반 : ");
        int cla = sc.nextInt();
        System.out.print("번 : ");
        int in = sc.nextInt();
        System.out.print("성별(M/F) : ");
        String gend = sc.next();
        System.out.print("성적 : ");
        double grade = sc.nextDouble();

        if(grade >= 90 ){ // 90점 이상이면 학점 A
            score = "A" ;
        }
        else if(grade >= 80){ // 80점 이상 90점 미만이면 학점 B
            score = "B";
        }
        else if(grade >= 70 ){ // 70점 이상 80점 미만이면 학점 C
            score = "C";

        }
        else if(grade >= 60 ){ // 60점 이상 70점 미만이면 학점 D
            score = "D";
        }
        else{


            score = "F"; // 60점 미만은 F

        }


        System.out.println(year + "학년 " + cla + "반 " + in + "번인 " + gend + "학생 " + name + "의 점수는 " + grade + "이고 " + score +"학점 입니다." );


    }
}
