package JAVA_HomeWork.HomeWork230907;

public class Practice2 {

    //문자열 배열을 사용해서
    //향상된 for Loop로 문자열 배열의 요소 중
    // 가장 긴 문ㄴ자열을 찾아 출력하기


    public static void main(String[] args) {
        String[] ss = {"lion","monkey","dog","elphant"}; //index = 0,1,2,3
        String longss = " ";
        //가장 긴 문자열 찾아서 출력하기
        for(String str : ss){
            if(longss.length() < str.length()){
                longss = str;
            }
        }

        System.out.println("가장 긴 문자열은 : " + longss);
    }

}



