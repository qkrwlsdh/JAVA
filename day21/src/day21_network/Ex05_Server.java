package day21_network;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Server {
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(7777);	// 생성자 매개변수에 포트번호 정수형식으로
		// 서버 소켓은 클라이언트의 접속을 받아서 처리하는 객체이다
		
		System.out.println("[Server] Listening...");	// 대상의 접속을 기다리는 대기상태
		Socket so = ss.accept();	// 클라이언트가 접속하면 클라이언트의 정보로 소켓을 생성
		
		InetAddress inet = so.getInetAddress();		// 소켓에서 대상의 주소정보를 가져와서
		System.out.println("접속자 정보 : " + so.getInetAddress());		// 출력
		
		Scanner sc = new Scanner(so.getInputStream());	// 소켓으로 입력스트림 생성
		String str = sc.nextLine();						// 대상이 전송한 문자열을 저장
		
		System.out.println("[" + inet.getHostAddress() + "] : " + str);
		// 대상의 주소와 전달받은 문자열을 출력
		
		so.close();
		ss.close();
		sc.close();
	}
}
