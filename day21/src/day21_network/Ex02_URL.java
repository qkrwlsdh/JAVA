package day21_network;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;

public class Ex02_URL {
	/*
	 * URL : Uniform Resource Locator, 네트워크 상의 자원이 어디에 있는지 표시하는 형식
	 */
	public static void main(String[] args) {
		try {
			
		URL url = new URL("http://www.naver.com");	// 프로토콜 (http://)을 꼭 작성하기
		
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("Host : " + url.getHost());
		System.out.println("Port : " + url.getPort());	// -1은 프로토콜의 기본 포트
		System.out.println("File : " + url.getFile());
		System.out.println();
		
		url = new URL("http://221.164.9.222/image/dora.png");
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("Host : " + url.getHost());
		System.out.println("Port : " + url.getPort());	// -1은 프로토콜의 기본 포트
		System.out.println("File : " + url.getFile());
		System.out.println();
		
		url = new URL("http://221.164.9.222/1207quiz.txt");
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("Host : " + url.getHost());
		System.out.println("Port : " + url.getPort());	// -1은 프로토콜의 기본 포트
		System.out.println("File : " + url.getFile());
		System.out.println();
		
		
		InputStream is = url.openStream();	// 지정한 URL을 통해서 데이터를 읽을 수 있는 통로 개방
		Scanner sc = new Scanner(is, "UTF-8");	// 글자를 읽어올때 반드시 인코딩형식을 지정
		
		System.out.println(url.getFile() + "의 내용");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		is.close();
		sc.close();

		url = new URL("https://mgr.kgitbank.com/index.it");
		is = url.openStream();
		sc = new Scanner(is, "UTF-8");
		
		System.out.println("문제 ");
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		is.close();
		sc.close();
		
		// http는 기본적으로 글자를 주고받는 프로토콜
		// HyperText Transfer Protocol
		
		}catch(MalformedURLException e) {
			System.out.println("잘못된 URL 예외 : " + e);
		}catch(IOException e) {
			System.out.println("입출력 예외 : " + e);
		}	
	}
}
