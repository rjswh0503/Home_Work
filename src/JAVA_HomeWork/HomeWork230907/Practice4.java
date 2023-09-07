package JAVA_HomeWork.HomeWork230907;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 숫자 : ");
        int num3 = sc.nextInt();
        System.out.print("네 번째 숫자 : ");
        int num4 = sc.nextInt();
        System.out.print("다 섯번째 숫자 : ");
        int num5 = sc.nextInt();


        int[] numbers = {num1,num2,num3,num4,num5};



        int sum = 0;

        for(int number : numbers){
                sum += number;



        }
        System.out.println("총합 : " + sum);




    }
}
