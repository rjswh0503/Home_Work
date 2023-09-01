import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //  입력 받을 값 Scanner
        System.out.print("1 ~ 12 사이의 정수 입력 : ");
        int month = sc.nextInt();

        switch (month){
            case 12: case 1: case 2: // case 문을 12 ~ 2
                System.out.println(+ month + "월은 겨울입니다.");

                break;
            case 3: case 4: case 5:
                System.out.println(+ month + "월은 봄 입니다.");

                break;
            case 6: case 7: case 8:
                System.out.println(+ month +"월은 여름 입니다.");

                break;
            case 9: case 10: case 11:
                System.out.println(+ month +"월은 가을 입니다.");

                break;
            default:
                System.out.println(+ month + "월은 잘못 입력된 달 입니다.");
        }



    }
}
