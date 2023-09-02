package com.kh.practice.array;

import java.util.Scanner;

/*
  사용자가 입력한 값이 배열에 있는지 검색하여

  있으면 "ooo 치킨 배달 가능", 없으면 " ooo 치킨은 없는 메뉴입니다."를 출력하세요.

  단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.

* */

public class ArrayPractice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String food  = sc.nextLine();
        int fd = 0;



                            //0    //1     //2      //3     //4
        String[] chiken = {"양념","후라이드","간장","눈꽃치즈","뿌링클",}; // 5개의 배열이 생성 됨.

        for(int i = 0; i < chiken.length;i++) {
            if(chiken[i].equals(food)){
                fd =+ 1;
                break;
            }
        }
        if(fd == 0){
            System.out.println(food + "치킨은 없는 메뉴입니다.");

        }else{
            System.out.println(food + "치킨은 배달 가능!!!!");
        }

    }

}





