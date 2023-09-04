package JAVA_HomeWork.hw.practice;

import java.util.Scanner;

public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("성별 : ");
        String gender = sc.next();

        System.out.print("성격 : ");
        String character = sc.next();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + gender);
        System.out.println("성격 : " + character);



    }
}
