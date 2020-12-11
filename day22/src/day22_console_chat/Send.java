package day22_console_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Send implements Runnable {
	
	// System.in 에서 입력받아서, so.getOutputStream()으로 보내는 클래스
	Socket so;
	Scanner sc;
	PrintWriter pw;
	private boolean exit;
	String userid;
	
	public Send(Socket so, String userid) {
		this.userid = userid;
		this.so = so;
		sc = new Scanner(System.in); 				// 내 컴퓨터 키보드로 입력
		
		try {
			pw = new PrintWriter(so.getOutputStream());	// 소켓 대상에게 문자열 보내기
		} catch (IOException e) {
			System.out.println("생성자 예외 : " + e);
		}
	}

	@Override
	public void run() {
		String msg = "";
		while(true) {
			if(msg.equals("exit") || exit) {
				break;
			}
			msg = sc.nextLine();
			pw.println("[" + userid + "] : " + msg);
			pw.flush();		// 보내기만 하고 flush안하면 메시지가 전송 안됨
		}
		
		sc.close();
		System.out.println("내가 종료함");
		System.exit(0);

	}

	public void exit() {
		this.exit = true;
	}
}
