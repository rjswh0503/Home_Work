package com.kh.tcpserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("서버 대기 중!");

            //만약에 클라이언트와 연결하고 싶다면 클라이언트와 연결하는 코드 작성

            while(true){
                //클라이언트와 연결 대기하는 코드
                Socket client = serverSocket.accept();
                System.out.println("클라이언트와 연결되었습니다.");

                client.close();
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
