package day21_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class Output implements Runnable {
	Scanner out;
	String msg;
	Socket so;

	Output(Socket so) {
		this.so = so;
	}

	@Override
	public void run() {
		try {
			out = new Scanner(so.getInputStream()); // Input에서 입력받은 소켓을 받고
			while (true) {
				msg = out.nextLine(); // 입력을 받으면
				System.out.println("서버 : " + msg); // 출력
				if ("exit".equals(msg))
					break;
			}
		} catch (IOException e) {
			System.out.println("예외발생 : " + e);

		} finally {
			out.close();
		}
	}
}

public class Ex06_Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket so = new Socket("127.0.0.1", 7777);
		Scanner in = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(so.getOutputStream());
		String msg;

		Output output = new Output(so);
		Thread th = new Thread(output);
		th.start();

		while (true) {
			System.out.print("클라이언트 입력 : ");
			msg = in.nextLine();
			pw.println(msg);
			pw.flush();
			if ("exit".equals(msg))
				break;
		}
		System.out.println("프로그램 종료, 소켓 닫기");
		so.close();
		in.close();
	}
}
