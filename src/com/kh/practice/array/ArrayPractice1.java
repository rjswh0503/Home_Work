package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 : ");
        int num = sc.nextInt();

        //배열의 길이를 선언
        int[] arry = new int[num];
        for(int i = 0; i < arry.length; i++) {
            // 5
            arry[i] = i + 1;




        }
        for(int i = 0; i < arry.length; i++){
            System.out.print(arry[i] + ", ");
        }


    }
}
