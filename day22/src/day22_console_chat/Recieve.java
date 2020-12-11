package day22_console_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Recieve implements Runnable {
	
	// so.getInputStream()으로 데이터를 전달받아서 내 컴퓨터의 System.out으로 출력하는 클래스
	Socket so;
	Scanner sc;
	PrintWriter pw;
	private boolean exit;
	public Recieve(Socket so) {
		this.so = so;
		try {
			sc = new Scanner(so.getInputStream());
		} catch (IOException e) {
			System.out.println("생성자 예외 : " + e);
		}
		pw = new PrintWriter(System.out);
	}

	@Override
	public void run() {
		String msg = "";
		
		while(true) {
			msg = sc.nextLine();
			pw.println(msg);
			if(msg.equals("exit") || exit) {
//				pw.close();	// System.out 닫으면 출력 안됨 !!
				sc.close();
				break;
			}
			pw.flush();		// 보내기만 하고 flush안하면 메시지가 전송 안됨
		}
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
}

