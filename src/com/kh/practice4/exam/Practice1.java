package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
                          //4

        if(num > 0){//초기식 //조건식  //증감식
            for (int i = 1; i <= num; i++){
                System.out.println(i + "");
            }
        }else{
            System.out.println("1 이상의 숫자를 입력하세요.");
        }
    }
}
