package JAVA_HomeWork.practice4.exam;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("숫자를 입력하세요. : " );
       int num = sc.nextInt();

       if(num > 1){
           for (int i = num; i >0; i--){
               System.out.println(i + "");
           }
       }else{
           System.out.println("1 이상의 숫자를 입력해주세요.");
       }




       }

    }

