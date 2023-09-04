package JAVA_HomeWork.hw.practice;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        while(true){
            if(num < 0){
                System.out.println("양수가 아닙니다.");
                break;



            }
            for (int i = 0; i <= num; i++) {
                for (int j = 0; j < i; j++) {

                    System.out.print("*");
                }
                System.out.println();

            }
            break;



        }





    }
}
