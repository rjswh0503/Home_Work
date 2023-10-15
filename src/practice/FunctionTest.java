package practice;

//public : 모든 곳에서 접근 가능 한 접근제한자 main메서드에 필수 사용
//void : 함수가 끝날 때 리턴값이 없다
public class FunctionTest {
                            //String[] args  : args 문자열을 배열로 사용하겠다 라는 의미
    public static void main(String[] args) { //메인 메서드
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1,num2); //add() 함수 호출
        System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다.");
        int result = substract(num1,num2);
        System.out.println(num1 + " - " + num2 + " = " + result + " 입니다.");
        result = times(num1,num2);
        System.out.println(num1 + " * " + num2 + " = " + result + " 입니다.");
        double value =divide (num1,num2);
        System.out.println(num1 + " / " + num2 + " = " + value + " 입니다.");


    }
    //static : 정적 메서드 이다.
    public static int add(int n1, int n2){ // add() 함수
        int result = n1 + n2;
        return result;
    }
    public static int substract(int n1, int n2){
        int result = n1 - n2;
        return result;
    }

    public static int times(int n1, int n2){
        int result = n1 * n2;
        return result;
    }

    public static double divide(double n1, double n2){
        double value = n1 / n2;
        return value;
    }


}
