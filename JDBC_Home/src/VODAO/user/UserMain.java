package VODAO.user;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Date;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        UserMain um = new UserMain();
        um.insertRun();


    }

    public void insertRun(){
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String DBUserName = "sh";
        String DBUserPassWord = "1234";

        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sh","1234");
            UserDAO userDao = new UserDAO(connection);
            Scanner sc = new Scanner(System.in);
            System.out.print("User ID : ");
            int userId  = sc.nextInt();
            System.out.print("아이디를 입력해주세요 : ");
            String userName = sc.next();
            System.out.println("회원가입이 거의 끝났습니다.");
            System.out.print("마지막으로 이메일 작성해주세요. : ");
            String email = sc.next();

            Date regDate = new Date(); // 현재 날짜와 시간을 사용한다는 의미

            //DB에 담기 위해 인스턴스 생성 후 작성받은 정보 저장
            UserVO newUser = new UserVO();
            newUser.setUser_id(userId);
            newUser.setUserName(userName);
            newUser.setEmail(email);
            newUser.setRegDate(regDate);

            //데이터가 정상적으로 들어갔는지 확인 boolean을 사용해서 확인

            if(userDao.createUser(newUser)){
                System.out.println("회원가입이 완료 되었습니다.");

            }else{
                System.out.println("회원가입에 실패 했습니다.");

            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }




}
