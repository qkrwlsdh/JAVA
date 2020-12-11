package day21_network;

public class Ex04_SocketInfo {

	/*
	 * 		네트워크를 구성하는 각각의 장비를 Node라고 한다
	 * 
	 * Node 중에서 IP주소를 가지는 End Device를 Host(컴퓨터 or 스마트폰)라고 한다
	 * (Router, Switch, Hub 등의 장비는 Host에서 제외)
	 * 
	 * Host 내부의 실행중인 프로그램을 Process라고 한다
	 * 하나의 Host가 여러개의 Process를 구동할 수 있으며
	 * 데이터를 주고 받는 주체는 Process이다
	 * 
	 * ex) 한 대의 컴퓨터에서 크롬 브라우저를 열어서
	 * 		하나는 네이버, 하나는 다음, 하나는 구글에 접속한다
	 * 		3개의 프로세스가 각각 서로 다른 데이터를 받아와서 화면에 출력하는 형식이다
	 * 
	 * 네트워크 상의 데이터가 IP를 이용하여 Host에 도착한 후
	 * Host의 특정 Process를 찾아갈 수 있어야 한다
	 * 특정 Process를 찾기 위해서는 통신 방식(Protocol), 포트 번호 등이 필요하다
	 * 
	 * ex) 웹 브라우저는 80, 443 등의 포트를 기본값으로 사용한다
	 * 		DNS 주소 요청은 53번 포트를 사용한다
	 * 
	 * 프로그램마다 각기 다른 포트번호를 사용한다 (프로토콜의 차이)
	 * 
	 * 같은 프로토콜, 같은 프로그램 파일, 같은 포트를 이용해도
	 * 서로 다른 프로세스로 실행 가능하므로 (단, 서버는 하나의 포트에 하나의 프로세스만 실행할 수 있다)
	 * 
	 * (리눅스 컴퓨터에서 웹 서버를 구현하는 Apache, nginX 같은 프로그램이 있지만
	 * 	두 개의 프로그램을 동시에 구동하여 웹 서버를 구현하려면 서로 다른 포트를 이용해야 한다
	 * 	80번 포트 개방은 하나만 가능하다)
	 * 
	 * 데이터가 목적지를 정확하게 찾으려면, 프로세스간 통신 연결점이 있어야 한다
	 * 네트워크 상 프로세스 간의 연결점을 Socket이라는 형태로 구현한다
	 */
}
