package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Server 에서 사용하는 클래스
// 서버에 접속한 개별의 클라이언트를 각각 스레드로 관리하는 클래스
public class ClientThread implements Runnable {

	Socket so;
	Scanner sc;
	PrintWriter pw;
	Server server;
	
	public ClientThread(Socket so, Scanner sc, PrintWriter pw, Server server) {
		this.so = so;
		this.sc = sc;
		this.pw = pw;
		this.server = server;
	}

	@Override
	public void run() {
		System.out.println("CT : " + this);
		String msg = "";
		while(true) {
			try {
				msg = sc.nextLine();
				if("exit".equals(msg)) { 
					break;
				}
				server.sendMessage(msg); 	// 리스트에 들어온 모든 pw객체에 메시지를 전달
				
			} catch(NoSuchElementException e) {	// sc의 통로(스트림) 반대편이 막혔다면
				server.plist.remove(pw);
				System.out.println("현재 접속자 수 : " + (server.plist.size()));
				break;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}	// end of while
		
		System.out.println(so.getInetAddress() + " 스레드 종료 !!");
		server.con.renewMessage();	// 화면에 메시지를 갱신하는 작업은 컨트롤러가 주체가 되어서 실행해야 한다
		sc.close();
		pw.close();
		try {	so.close();		} catch (IOException e) {}
	}
}

