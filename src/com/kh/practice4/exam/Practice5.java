package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.print(i);

            if (num == i) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
        }
        System.out.print(sum);

    }
}
