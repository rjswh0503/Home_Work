package JAVA_HomeWork.HomeWork230907;


import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList();
        //  빈 ArrayList 생성



        // add()를 통해 색 요소 추가


        color.add("빨");
        System.out.println("  첫번째  색상" + color);
        color.add("주");
        System.out.println("  두번째  색상" + color);

        color.add("노");
        System.out.println("  세번째  색상" + color);

        color.add("초");
        System.out.println("  네번째  색상" + color);

        color.add("파");
        System.out.println(" 다섯번째 색상" + color);

        color.add("남");
        System.out.println(" 여섯번째 색상" + color);

        color.add("보");
        System.out.println(" 일곱번째 색상" + color);


        System.out.println("===============================================================");
        int size = color.size(); // size()로 모든 색상의 수
        System.out.println("모든 색상의 수 :" +size);
        System.out.println("===============================================================");


        //요소 수정
        // 주황색 - 블랙
        // 초록색 - 브라운
        // 남색 - 그린

        color.set(1,"블랙");
        color.set(3,"브라운 ");
        color.set(5,"그린");
        System.out.println("수정 체크 : " + color);


        //remove를 사용하여 색상에 해당하는 인덱스 제거

        color.remove(1);
        color.remove(2);
        color.remove(3);
        color.remove(1);        // 이쪽은 잘 모르겠음







        // 최종 색 상 출력 : 빨, 파, 보

        for(String asdasdw:color){
            System.out.println("색상 목록 : " + asdasdw);

        }


    }


}
