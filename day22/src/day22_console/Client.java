package day22_console;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket so = new Socket("127.0.0.1", 7777);	// 소켓 host, port를 생성
		
		Send send = new Send(so);
		Recieve recv = new Recieve(so);
		
		Thread th = new Thread(send);
		th.start();
		
		Thread th2 = new Thread(recv);
		th2.start();
		
	}
}
