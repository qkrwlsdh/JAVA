package day22_console;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {

		Socket so;
		ServerSocket ss;

			ss = new ServerSocket(7777);	// 서버 포트 7777로 생성
			System.out.println("7777 포드 접속 대기중...");
			so = ss.accept();				// 7777 포드로 접속
			
			Send send = new Send(so);
			Recieve recv = new Recieve(so);

			Thread th = new Thread(send);
			th.start();

			Thread th2 = new Thread(recv);
			th2.start();
			
	}
}
