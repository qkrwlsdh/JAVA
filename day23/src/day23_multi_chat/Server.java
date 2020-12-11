package day23_multi_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
	
	static ArrayList<PrintWriter> plist = new ArrayList<PrintWriter>();
	// 서버에 접속한 각각의 클라이언트에게 문자열을 전달할 수 있는 PrintWriter 객체가 모여있는 리스트
	
	static void sendMessage(String str) {	// 접속된 모든 클라이언트에게 데이터를 출력
		if(str == null) return;
		for(PrintWriter pw : plist) {
			pw.println(str);
			pw.flush();
		}
	}
	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		plist.add(out);		// 서버 컴퓨터의 System.out에도 문자열이 전달될 수 있도록 리스트에 추가한다
		
		ServerSocket ss = null;		Socket so = null;
		PrintWriter pw = null;		Scanner sc = null;
		String host = null;
		
		int port = 7777;
		
		try {
			ss = new ServerSocket(port);
			
			while(true) {
				System.out.printf("접속 대기중...(%d)\n", plist.size() - 1);
				so = ss.accept();
				host = so.getInetAddress().getHostAddress();
				host += ":" + so.getPort();
				sendMessage("\n\t" + host + "님이 접속했습니다\n");
				
				sc = new Scanner(so.getInputStream());
				pw = new PrintWriter(so.getOutputStream());
				
				ClientThread ct = new ClientThread(so,sc,pw);
				new Thread(ct).start();
				plist.add(pw);
			}
		} catch(BindException e) {
			System.out.println("이미 포트를 사용중입니다 : " + port);
			try { Runtime.getRuntime().exec("taskkill /f /im javaw.exe");
		} catch(IOException e1) {}
		} catch(IOException e) {
			System.out.println("입출력 예외");
		} finally {
			plist.clear();
			try { if(pw != null) pw.close(); } catch(Exception e) {}
			try { if(so != null) so.close(); } catch(Exception e) {}
			try { if(ss != null) ss.close(); } catch(Exception e) {}
		}
	}
}
