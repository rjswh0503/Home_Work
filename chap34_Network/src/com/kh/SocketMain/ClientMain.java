package com.kh.SocketMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {                 //입출력 예외 처리를 위한
    public static void main(String[] args) throws IOException {
        //서버에 연결하기 위한 소켓 생성
        Socket socket = new Socket("localhost", 2348);
        //서버로 데이터를 보내기 위한 출력 스트림 생성
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        //서버로부터 데이터를 받기 위한 입력 스트림 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //키보드로부터 입력 받기 위한 생성
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String userInputString;
        System.out.println("서버와 대화를 시작합니다. 종료하려면 'exit'를 입력하세요.");
        while ((userInputString = userInput.readLine()) != null) {
            out.println(userInputString);

            //서버로부터 받은 응답 출력
            String serverResponse = in.readLine();
            System.out.println("서버 응답 : " + serverResponse);

            //사용자가 'exit'를 누르면 대화 종료
            if ("exit".equalsIgnoreCase(userInputString)) {
                    break;

            }
        }
        //소캣 및 입력 스트림 닫기
        socket.close();
        userInput.close();

    }
}
