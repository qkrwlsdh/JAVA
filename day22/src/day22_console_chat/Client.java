package day22_console_chat;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.NoSuchElementException;

public class Client {
	public static void main(String[] args) {

		Socket so = null;
		Send send = null;
		Recieve recv = null;
		Thread th1 = null;
		String serverIP = "127.0.0.1";
		int serverPort = 7777;
		
		try {
			so = new Socket(serverIP, serverPort);
			
			send = new Send(so, "CLIENT");
			recv = new Recieve(so);
			
			th1 = new Thread(send);
			th1.start();
			
			recv.run();
			send.exit();
			
			try { so.close(); } catch(Exception e1) {}
			System.exit(0);
			
		} catch(ConnectException e) {
			System.out.println("서버에 접속할 수 없습니다 : " + serverIP);
			
		} catch(NoSuchElementException e) {
			System.out.println("대상이 종료함");
			System.exit(0);
			
		} catch (IOException e) {
			System.out.println("입출력 예외 : " + e);
			
		} catch(Exception e) {
			System.out.println("기타 예외 발생 : " + e);
		}
		
	}
}
