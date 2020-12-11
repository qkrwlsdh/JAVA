package day21_network;

//import java.io.BufferedWriter;
import java.io.OutputStream;
//import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) throws Exception{
		
		Socket so = new Socket("221.164.9.161", 7777);
		// 127.0.0.1 은 어느상황에서나 자기 자신의 컴퓨터를 가리키는 IP주소이다
		
		OutputStream os = so.getOutputStream();		// 지정한 소켓을 대상으로 출력하는 스트림
//		OutputStreamWriter osw = new OutputStreamWriter(os);	// 글자(character)를 출력하는 스트림
//		BufferedWriter bw = new BufferedWriter(osw);	// 버퍼를 이용하여 글자를 출력하는 스트림
		PrintWriter pw = new PrintWriter(os);		// 문자열을 바로 출력하는 스트림
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[Client] 연결되었습니다");
		System.out.print("서버에게 전송할 문자열 입력 : ");
		String text = sc.nextLine();
		pw.println(text);
		pw.flush();
		
		pw.close();
//		bw.close();
//		osw.close();
		os.close();
		so.close();
		sc.close();
	}
}
