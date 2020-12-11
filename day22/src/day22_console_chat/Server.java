package day22_console_chat;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;

public class Server {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket so = null;
		Send send = null;
		Recieve recv = null;
		Thread th1 = null;
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("7777 포트 접속 대기중...");
			so = ss.accept();
			
			System.out.println("=== 채팅 시작 ===");
			
			send = new Send(so, "SERVER");
			recv = new Recieve(so);
			
			th1 = new Thread(send);
			th1.start();
			
			recv.run();	// 종료전 까지는 다음 코드로 진행하지 않는다
			
			send.exit();
			try { so.close(); } catch(Exception e1) {}
			try { ss.close(); } catch(Exception e1) {}
			System.exit(0);
			
		} catch (BindException e) {		// 지정한 포트가 이미 Listen중이라서 발생하는 예외
			System.out.println("이미 포트를 사용중입니다. 재실행 해주세요");
			String cmd = "taskkill /f /im javaw.exe";
			try {
				Runtime.getRuntime().exec(cmd);
			} catch (IOException e1) {}
			
		} catch(NoSuchElementException e) {
			System.out.println("대상이 종료함");
			System.exit(0);
		} catch(IOException e) {
			System.out.println("입출력에 의한 예외가 발생 : " + e);
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("기타 예외 발생 : " + e);
		} 
		
	}
}
