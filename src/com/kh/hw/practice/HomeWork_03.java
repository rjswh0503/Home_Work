package com.kh.hw.practice;

import java.util.Scanner;

public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();

        int sum = 0; //0    //3
        for(int i = 0; i <= num; i++)
            sum += i;

        System.out.println(+ num2 + " 부터 " + num + " 까지 " + "정수들의 합: " +sum);
    }
}
