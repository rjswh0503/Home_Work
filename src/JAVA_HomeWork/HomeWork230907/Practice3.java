package JAVA_HomeWork.HomeWork230907;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};    // 1~5 까지의 정수 배열을 선언하고 초기화
                                        //index 는 0,1,2,3,4



        for(int number:numbers){ //향상된 for문으로 numbers의 각 요소를 int 형식 변수인 number에 대입하고 반복적으로 실행
            System.out.println("숫자: " + number);
        }


    }
}
