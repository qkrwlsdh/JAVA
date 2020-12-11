package day22_console;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Send implements Runnable{
//	System.in에서 입력받아서, so.getOutputStream()으로 보내는 클래스
	Scanner sc;
	PrintWriter pw;
	Socket so;
	
	Send(Socket so) throws IOException{
		this.so = so;
		sc = new Scanner(System.in);				// 내 컴퓨터 키보드로 입력
		pw = new PrintWriter(so.getOutputStream());	// 소켓 대상에게 문자열 보내기
	}
	
	@Override
	public void run() {
		String msg;
		
		while(true) {
			msg = sc.nextLine();
			if(msg.equals("exit"))
				break;
			pw.println(msg);
			pw.flush();
		}
		pw.close();
		sc.close();
	}
}
