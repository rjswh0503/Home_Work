package JAVA_HomeWork.HomeWork230907;

import java.util.Scanner;

public class Practice4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("정수 5개를 입력하세요 .");


            int[] numbers = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("정수 " + (i) + " : ");
                numbers[i] = sc.nextInt();

            }


            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }


            System.out.println("총합 : " + sum);


        }
    }

