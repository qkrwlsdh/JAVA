package day21_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Input implements Runnable {
	Scanner in;
	PrintWriter pw;
	Socket so;
	String msg;

	Input(Socket so) { // Input객체를 생성하기 위해서는, 대상의 정보를 가지고 있는 Socket객체를 전달해야만 한다
		this.so = so;
	}

	@Override
	public void run() {
		try {
			in = new Scanner(System.in); // 내 컴퓨터에서 입력을 받아서
			pw = new PrintWriter(so.getOutputStream(), true); // 소켓의 대상에게 보낸다
			while (true) {
				msg = in.nextLine(); // 입력을 받으면
				pw.println(msg); // PrintWriter로 입력받은 msg를 출력해라
				if ("exit".equals(msg)) // 만약 "exit"를 입력받았다면
					break;				// 반복문을 빠져나가라
			}
		} catch (IOException e) {
			System.out.println("입력에서 예외 발생 : " + e);
		}

	}
}

public class Ex06_Server {
	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket so = null;
		Scanner sc = null;
		String msg = null;

		try {
			ss = new ServerSocket(7777); // 서버 소켓 개방(클라이언트 접속 대기)
			System.out.println("접속 대기중...");
			so = ss.accept(); // 접속하면 대상의 정보가 소켓에 담겨있다
			sc = new Scanner(so.getInputStream()); // 대상이 보내는 정보를 입력받는 sc
			System.out.println(so.getInetAddress().getHostAddress() + "님이 접속했습니다");

			Input input = new Input(so); // 클라이언트 정보가 담긴 소켓을 전달하여 객체 생성
			Thread th = new Thread(input); // Input객체를 Thread화 한다
			th.start(); // 입력받아서 소켓대상에게 문자열을 보내는 스레드

			while (true) {
				msg = sc.nextLine(); // sc로 대상이 보낸 메세지를 받아서
				System.out.println(msg); // 내 화면에 출력한다
			}

		} catch (IOException e) {
			System.out.println("입출력 예외 : " + e);
		} catch (Exception e) {
			System.out.println("기타 예외 발생 : " + e);
		} finally {
			try {
				if (so != null)
					so.close();
			} catch (Exception e) {
			}
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
			}
			try {
				if (sc != null)
					sc.close();
			} catch (Exception e) {
			}
		}
	}
}
