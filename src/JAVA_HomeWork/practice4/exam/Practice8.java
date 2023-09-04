package JAVA_HomeWork.practice4.exam;

import java.util.Scanner;

/*
사용자로부터 입력 받은 숫자의 단을 출력하세요.
  */




public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        System.out.print("숫자 : ");
        int num = sc.nextInt(); // 입력 받을 숫자
        System.out.println("==== " + num + " 단 ====");


        int result = 0;
                        // 입력 받는 숫자에서 7을 입력하면 num은 7이 된다.
                            //(7)
        for(int i  = 1; i <= 9; i++) {



            result += num ;

            System.out.println(num + " * " + i + " = " + result);

        }

        }
    }
