package client;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller implements Initializable {
	
	@FXML Text msg;
	@FXML TextField ipField, portField, nameField;
	@FXML Button startBtn, quitBtn;
	
	Client client;
	Socket so;
	
	private ChatController changeScene(String serverIP, int port) throws IOException {
		// 장면 전환 채팅으로
		Stage primaryStage = (Stage) msg.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("chatView.fxml"));
		Parent root = loader.load();
		
		String title = String.format("%s:%d - 채팅 서버 접속 중", serverIP, port); 
		
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle(title);
		primaryStage.show();
		
		ChatController con = loader.getController();
		con.mainCon = this;
		return con; 
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		msg.setText("서버의 IP와 Port번호를 입력하고, 시작 버튼을 클릭하세요");
		
		// 입력하기 귀찮아......
		ipField.setText("192.168.0.222");
		portField.setText("7777");
		new Thread(() -> { Platform.runLater(() -> { nameField.requestFocus();});}).start();
		
		startBtn.setOnAction(actionEvent -> {
			
			// 소켓 생성 및 클라이언트 객체 생성 스레드로 동작 (직접 작성하세요)
			String serverIP = ipField.getText();
			int port = Integer.parseInt(portField.getText());
			String name = nameField.getText();
			
			try {
				so = new Socket(serverIP, port);
				client = new Client(so, name, changeScene(serverIP, port));
				Thread th1 = new Thread(client);
				th1.start();
				
			} catch (ConnectException e) {
				String str = String.format("%s:%d 서버에 연결할 수 없습니다", serverIP, port);
				msg.setText(str);
				
			} catch (IOException e) {
				e.printStackTrace();
			
			} finally {
				
				
			} 
		});
		
		quitBtn.setOnAction(actionEvent -> {
			Platform.exit();
		});
	}
}

