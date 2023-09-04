package JAVA_HomeWork.practice.array;

import java.util.Scanner;
/*
"월" ~ "일" 까지 초기화된 문자열 배열을 만들고 0부텨 6까지 숫자를 입력받아

입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 범위에

없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요.
*/
public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0 ~ 6 사이 숫자 입력 : " );
        int num = sc.nextInt();
                         // "월","화","수","목","금","토","일" 초기화 된 문자열 배열을 만듬
        String[] day = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"}; // 길이가 7인 String 배열 선언
            if(num <= 6){//0       1       2       3      4       5       6
                for(int i = 0; i < day.length; i++){

                    System.out.println(day[num]);
                    break;

                }
            }else if(num > 6){


                System.out.println("잘못 입력하셨습니다.");

            }








    }
}
