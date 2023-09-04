package JAVA_HomeWork.hw.practice;

import java.util.Scanner;

public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int num = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("연산자(+, -, *, /) : ");
        char chr = sc.next().charAt(0);

        int result = 0;

        char num2 = 0;


        if (num < 1 || num1 < 1) {

            System.out.println(num2 + "으로 나눌 수 없습니다.");
        } else if (num > 1 || num1 > 1) {
            System.out.println(num + " / " + num1 + " = " + result);
        }


    }
}



