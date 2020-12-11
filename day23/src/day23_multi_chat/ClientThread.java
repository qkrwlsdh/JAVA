package day23_multi_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 서버에서 사용하는 클래스
// 서버에 접속한 개별의 클라이언트를 각각 스레드로 관리하는 클래스
public class ClientThread implements Runnable{
	
	Socket so;
	Scanner sc;
	PrintWriter pw;
	
	public ClientThread(Socket so, Scanner sc, PrintWriter pw) {
		this.so = so;
		this.sc = sc;
		this.pw = pw;
	}

	@Override
	public void run() {
		String msg = "";
		while(true) {
			try {
				msg = sc.nextLine();
				if("exit".equals(msg))
					break;
				Server.sendMessage(msg);		// 리스트에 들어온 모든 pw객체에 메세지를 전달
			
			} catch(NoSuchElementException e) {
				System.out.println("NOSUCH : ClientThread 종료");
				Server.plist.remove(pw);
				System.out.println("현재 접속자 수 : " + (Server.plist.size() - 1));
				break;
			}
		}	// end of while
		sc.close();
//		pw.close();		// pw를 닫으면 위 내용이 출력 안됨
		try { so.close(); }	catch (IOException e) {}
		
	}
}
