package com.kh.hw.practice;

import java.util.Scanner;


// switch 문

public class HomeWork_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 간단 계산기");
        System.out.println("2. 작은 수에서 큰 수까지 합계");
        System.out.println("3. 신상 정보 확인");
        System.out.println("4. 학생 정보 확인");
        System.out.println("5. 별과 숫자 출력");
        System.out.println("6. 난수까지의 합계");
        System.out.println("7. 구구단");
        System.out.println("8. 주사위 숫자 알아맞추기 게임");
        System.out.println("9. 프로그램 종료");




        System.out.print("메뉴 번호 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println(" 간단 계산기");
                break;
            case 2:
                System.out.println(" 작은 수에서 큰 수까지 합계");
                break;
            case 3:
                System.out.println(" 신상 정보 확인");
                break;
            case 4:
                System.out.println(" 학생 정보 확인");
                break;
            case 5:
                System.out.println(" 별과 숫자 출력");
                break;
            case 6:
                System.out.println(" 난수까지의 합계");
                break;
            case 7:
                System.out.println(" 구구단");
                break;
            case 8:
                System.out.println(" 주사위 숫자 알아맞추기 게임");
                break;
            case 9:
                System.out.println("종료 합니다.");
                break;
            default:
                System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요.");

        }









    }

}
