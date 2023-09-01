package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("숫자를 입력해주세요 : "); // 입력 받을 숫자
            int num = sc.nextInt();

            if(num < 1){ // num이 1보다 작을때  ex ) 0
                System.out.println("1이상의 숫자를 입력해주세요.");
            }else{ // 그게 아니라면
                for(int i = num; i > 0; i--){ //
                    // num은 입력 받은 숫자 ex) 입력한 숫자가 7이면 num은 7이 된다.
                    System.out.println(i + "");
                }
                break;
            }


        }


    }
}

