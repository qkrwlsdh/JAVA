package day22_console;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Recieve implements Runnable{
//	so.getInputStream()으로 데이터를 전달받아서 내 컴퓨터의 System.out으로 출력하는 클래스
	Scanner sc;
	Socket so;
	PrintWriter pw;
	
	Recieve(Socket so) throws IOException{
		this.so = so;
		sc = new Scanner(so.getInputStream());	// 소켓으로 받은 문자열 입력
		pw = new PrintWriter(System.out);		// printWriter로 출력
	}
	
	@Override
	public void run() {
		String msg;

		while(true) {
			msg = sc.nextLine();
			if(msg.equals("exit"))
				break;
			pw.println(msg);
			pw.flush();		// 보내기만 하고 flush 안하면 메세지 전송 안됨
		}
		pw.close();
		sc.close();
	}
}
