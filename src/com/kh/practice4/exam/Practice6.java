package com.kh.practice4.exam;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번쨰 숫자 : ");
        int num = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num1 = sc.nextInt();

                //(or)
        if(num < 1 || num1 < 1){


        }else{//(5)  //(2)
            if(num1 > num){
                for(int i = num; i <= num1; i++){

                    System.out.println( i  +  "");
                }
            }else{
                for(int i = num1; i <= num; i++){
                    System.out.println(i  +  " ");
                }
            }
        }



    }
}
