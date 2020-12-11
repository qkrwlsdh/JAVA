package day21_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01_NetworkBasic {
	public static void main(String[] args) {
		
		InetAddress inet1 = null;
		InetAddress inet2 = null;
		
		try {
			
			inet1 = InetAddress.getByName("lol.inven.co.kr");	// Domain Name
			
			System.out.println("<inet1>");
			System.out.println("getLocalHost : " + InetAddress.getLocalHost());
			System.out.println("getHostName : " + inet1.getHostName());
			System.out.println("getHostAddress : " + inet1.getHostAddress());
			System.out.println("getCanonicalHostName : " + inet1.getCanonicalHostName());
			System.out.println();
			
			byte[] addr = {(byte)125, (byte)209, (byte)222, (byte)141};
			// 125.209.222.141
			inet2 = InetAddress.getByAddress(addr);				// IP Address
			System.out.println("<inet2>");
			System.out.println("getLocalHost : " + InetAddress.getLocalHost());
			System.out.println("getHostName : " + inet2.getHostName());
			System.out.println("getHostAddress : " + inet2.getHostAddress());
			System.out.println("getCanonicalHostName : " + inet2.getCanonicalHostName());
			System.out.println();
			
		} catch(UnknownHostException e) {
			System.out.println("호스트를 알수 없습니다 : " + e);
		}
	}
	
	/*
	 * 	Network : 서로 다른 컴퓨터끼리 연결해서 작업을 주고 받을 수 있는 형식, 혹은 그 환경
				물리적 매개체가 있어야 한다

		Internet : 서로 다른 네트워크를 연결하여 만들어진 거대한 네트워크

		Internet Protocol : IP, 인터넷을 사용하기 위해서 서로가 지켜야 하는 규칙이나 약속			컴퓨터 이름 (건물 주소)
		TCP/UDP																	포트 번호 (방 번호)
		Application Layer Protocol : HTTP, FTP, SMB, SMTP, HTTPS, SSH, TELNET	상세 통신 (대화 내용)

		IP address : IP에서 네트워크 상의 컴퓨터(호스트)들이 서로를 식별하기 위한 숫자로 되어있는 이름
		125.209.222.141
		192.168.10.100	->	1100 0000.1010 1000.0000 1010.0110 1000
		
		Domain Name System : DNS, IP와 Domain Name(글자 주소)
		www.naver.com
		dns1.google.com
		
		https://www.naver.com		도메인 주소
		https://125.209.222.141		IP 주소
	 */
}
