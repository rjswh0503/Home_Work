package JAVA_HomeWork.practice.array;

import java.util.Scanner;

/*

  3이상의 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고

  중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.

  단, 입력한 정수가 홀수가 아니거나 3미만일 경우 " 다시 입력하세요 " 를 출력하고 다시 정수를 받도록 하세요.

* */

import java.util.Scanner;

public class ArrayPractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 정수 : ");
        int inp = sc.nextInt();
        int num = 1;
        while(true){
            if(inp < 3 || inp % 2 == 0 ){
                System.out.println("다시 입력해주세요.");

            }else{
                int[] arry = new int[inp];
                for(int i = 0; i < arry.length; i++){
                    if(i < arry.length / 2){
                        arry[i] =  num++;


                    }else{
                        arry[i] = num--;
                    }if(i < arry.length -1){
                        System.out.print(arry[i] + ",");
                    }else{
                        System.out.println(arry[i]);
                    }

                }

            }
            break;
        }

    }
}