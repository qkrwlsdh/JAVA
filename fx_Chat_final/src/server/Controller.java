package server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

// View의 요소를 제어하고, Server 스레드와 데이터를 주고 받는 클래스
public class Controller implements Initializable {
	
//	public Controller() {
//		System.out.println("컨트롤러 객체 생성");
//	}
	
	@FXML Text msgText;
	@FXML TextField portField;
	@FXML Button startBtn, stopBtn, joinBtn, quitBtn;
	
	Server server;
	String serverIP;
	int port;
	
	// 서버 컴퓨터의 IP중에서 가상IP와 루프백IP를 제외하고 실제 IP를 찾아주는 메서드
	private String getLocalServerIP() {
		try {
			Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
			
			while(en.hasMoreElements()) {
				NetworkInterface intf =  en.nextElement();
				Enumeration<InetAddress> enumIP = intf.getInetAddresses();
				
				while(enumIP.hasMoreElements()) {
					InetAddress ia = enumIP.nextElement();
					if(ia.isLoopbackAddress() == false && ia.isLinkLocalAddress() == false && ia.isSiteLocalAddress()) {
						return ia.getHostAddress();
					}
					// 127.0.0.1 ~ 127.255.255.254 : Loopback IP, 항상 자기 자신을 가리킨다
					// 랜선을 뽑아도 ping 127.0.0.1 하면 통신된다
				}
			}
		} catch(SocketException e) {}
		return null;
	}
	
	// 현재 접속자 인원 수를 View에 표현해야 하는데, View의 갱신은 컨트롤러가 주체가 되어서 수행해야 한다
	public void renewMessage() {
		String text = String.format("%s:%d - 접속자 (%d)", 
				serverIP, port, server.plist.size());
		msgText.setText(text);
	}
	
	// 지정한 서버 포트를 사용하는 프로세스의 목록을 윈도우에서 출력해서 그 결과를 받아온다
	public void netstat() {
		String command = "netstat -anop tcp";
		try {
			Process pro = Runtime.getRuntime().exec(command);
			Scanner sc = new Scanner(pro.getInputStream());
			while(sc.hasNextLine()) {
				String text = sc.nextLine();
				if(text.contains(":" + port)) {
					System.out.println(text);
				}
			}
			sc.close();
		} catch (IOException e) {}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		msgText.setText("서비스를 시작하려면 포트 번호를 입력하고 시작 버튼을 누르세요");
		stopBtn.setDisable(true);
		joinBtn.setDisable(true);
		
		startBtn.setOnAction(actionEvent -> {	// 시작 버튼 누르면 수행되는 메서드
			
			port = Integer.parseInt(portField.getText());
			server = new Server(port, this);	// server가 나(Controller)한테 필요한거 있으면 연락하라고 자기 주소를 같이 전해줌
			Thread th = new Thread(server);
			th.start();
			
			netstat();
			
			startBtn.setDisable(true);		// 시작버튼 비활성화
			stopBtn.setDisable(false);		// 중지버튼 활성화
			portField.setDisable(true);		// 포트 입력 필드 비활성화
			serverIP = getLocalServerIP();	// 서버의 IP를 구해서
			renewMessage();					// 메시지를 갱신한다
		});
		
		stopBtn.setOnAction(actionEvent -> {
			System.out.println("중지");
			try {
				server.ss.close();
				startBtn.setDisable(false);
				stopBtn.setDisable(true);
				portField.setDisable(false);
				msgText.setText("서비스를 시작하려면 포트 번호를 입력하고 시작 버튼을 누르세요");
			} catch (IOException e) {
				System.out.println("서버 소켓 중지");
			}
		});
		
		joinBtn.setOnAction(actionEvent -> {
			System.out.println("참여 (미구현)");
		});
		
		quitBtn.setOnAction(actionEvent -> {
			System.out.println("종료");
			Platform.exit();
		});
	}
}

