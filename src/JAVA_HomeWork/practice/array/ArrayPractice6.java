package JAVA_HomeWork.practice.array;

import java.util.Scanner;



/*

주민등록번호 성별자리 이후부터 *로 가리고 출력하세요
단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

 */

public class ArrayPractice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호(-포함) : ");
        String str = sc.next();
        char[] org = new char[str.length()];
        for(int i = 0; i < org.length; i++){
            org[i] = str.charAt(i);

        }
        char[] copy = new char[org.length];
        for(int i = 0; i <copy.length; i++){
            if( i <= 7){
                copy[i] = org[i];
            }else{
                copy[i] = '*';
            }
            System.out.println(copy[i]);
        }


        }






    }

