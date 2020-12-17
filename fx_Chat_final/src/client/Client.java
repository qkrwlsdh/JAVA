package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Client implements Runnable {

	Socket so;
	PrintWriter pw;
	ChatController con;	// ChatController 가 직접 함수를 호출하는 형태로
	Scanner sc;
	int port;
	String id;
	
	public Client(Socket so, String id, ChatController con) throws UnknownHostException, IOException {
		this.so = so;
		pw = new PrintWriter(so.getOutputStream());	// 대상에게 데이터를 내보낼 수 있는 pw
		sc = new Scanner(so.getInputStream());		// 대상으로부터 데이터를 받을수 있는 sc
		this.con = con;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				String msg = sc.nextLine();
				if (msg != null) {
					con.getMessage(msg); // 데이터를 Client가 입력받아도, 화면에 처리하는건 컨트롤러다
				}
			}
			
		} catch(NoSuchElementException e) {
			System.out.println("nosuch");
			
		} catch(Exception e) {
			System.out.println("기타 예외 : " + e);
		} 
		
	}

	void sendMessage(String input) {
		pw.println("[" + id + "] : " + input);
		pw.flush();
	}
}

