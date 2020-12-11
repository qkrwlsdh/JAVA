package day23_multi_chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 내 컴퓨터에서 키보드로 입력하면 서버에게 전달
public class Client {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter pw = null;
		Socket so = null;
		String msg = "";
		
		try {
//			so = new Socket("221.164.9.161", 7777);		// 서버에 접속 (서버가 준비되어야함)
			so = new Socket("127.0.0.1", 7777);		// 서버에 접속 (서버가 준비되어야함)
			sc = new Scanner(System.in);
			pw = new PrintWriter(so.getOutputStream());		// 서버에게 보내기
			
			new Thread(new Recieve(so)).start();
			
			String id = null;
			System.out.println("ID를 입력하세요 : ");
			id = sc.nextLine();
			pw.println("\n\t[" + id + "] : " + "님이 대화에 들어왔습니다\n");
			pw.flush();
			
			System.out.println("=== 채팅 시작 ===\n");
			
			while(true) {
				msg = sc.nextLine();
				if("exit".equals(msg)) {
					System.out.println("프로그램 종료");
					pw.println("\n\t[" + id + "] : " + "님이 대화를 종료합니다\n");
					pw.flush();
					break;
				}
				if("".equals(msg) == false) {
				pw.println("[" + id + "] : " + msg);	// ID와 msg를 같이 전송
				pw.flush();
				}
			}
		} catch (ConnectException e) {
			System.out.println("서버가 아직 준비 안됨");
			System.exit(0);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			try {
				if(so != null) so.close();
			} catch(Exception e) {}
		}
	}
}
