package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Scanner;

// ClientThread(각각의 클라이언트)를 관리하고, 특정 클라이언트에게 받은 문자열을 plist를 통해서 모두에게 재전송하는 클래스
public class Server implements Runnable {

	ServerSocket ss;
	Controller con;
	int port;
	ArrayList<PrintWriter> plist = new ArrayList<PrintWriter>();

	// 생성자
	public Server(int port, Controller con) {
		this.port = port;
		this.con = con;
	}
	
	// 서버 소켓을 열고 접속자의 소켓정보를 받아서 ClientThread로 구동하는 메서드
	private void serverStart() throws IOException {
		// 주요 서버의 작동 내용
		ss = new ServerSocket(port);
		
		while(true) {
			Socket so = ss.accept();
			
			// 소켓으로 입력 및 출력 객체를 생성하여 ClientThread 객체를 스레드로 시작
			// PrintWriter는 plist에 추가하여 여러 명에게 동시 전달이 가능하도록 구성
			Scanner sc = new Scanner(so.getInputStream());
			
			PrintWriter pw = new PrintWriter(so.getOutputStream());
			plist.add(pw);	// 생성한 pw를 plist에도 넣고 (같은 주소값)
			
			ClientThread ct = new ClientThread(so, sc, pw, this);	// ct에도 전달한다 (같은 주소값)
			Thread th = new Thread(ct);
			th.start();
			
			// 클라이언트의 접속이 발생하면, 컨트롤러에게 메시지를 갱신하라고 요청한다
			con.renewMessage();
			con.netstat();
		}
	}
	
	// plist에 저장된 모든 대상에게 메시지를 전송하는 메서드
	public void sendMessage(String msg) {
		System.out.println(msg);
		if(msg != null) {
			for(PrintWriter pw : plist) {
				pw.println(msg);
				pw.flush();
			}
		}
	}
	
	// 스레드 run()
	@Override
	public void run() {
		try {
			serverStart();
			
		} catch (BindException e) {		// 이미 다른 프로세스가 지정한 포트를 사용중인 경우
			String cmd = "taskkill /f /im javaw.exe";
			try { Runtime.getRuntime().exec(cmd); } catch(Exception pass) {}
			System.out.println("이미 " + port + " 포트를 사용중입니다. 재시작하세요");
		
		} catch (SocketException e) {
			System.out.println("서버 상태 : LISTEN -> CLOSE");
			
		} catch (IOException e) {
			System.out.println("IOException : " + e);
		}
	}
}
