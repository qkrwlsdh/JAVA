package client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class ChatController implements Initializable {

	@FXML TextArea chatView;
	@FXML TextField inputField;
	@FXML Button submit;
	
	Controller mainCon;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		chatView.setEditable(false);	// 창은 활성화되어 있으나, 사용자 편집이 불가능한 상태
		
		
		Thread th = new Thread(() -> {
			Platform.runLater(() -> {	// Platform.runLater(Runnable) : Thread가 start하면 Thread객체가 소멸(함수종료)
				inputField.requestFocus();
			}); 
		});
		th.start();
		
		submit.setOnAction(actionEvent -> {
			String input = inputField.getText();	// 입력한 내용을 가져와서
			mainCon.client.sendMessage(input);		// 메인컨트롤러가 가지는 client객체를 참조하여 sendMessage할수 있도록 호출
			inputField.setText("");					// 입력보냈으니 필드는 글자를 지워준다
			inputField.requestFocus();				// 다시 입력해야 되니까 포커스 요청한다
		});
		
		// 이벤트를 만들어주면, 내가 원하는 조건에 항상 메서드가 호출되어서 실행된다
		// while을 이용할 필요가 없다
		inputField.setOnKeyPressed(keyEvent -> {
			if(keyEvent.getCode() == KeyCode.ENTER) {	// 입력필드에서 엔터치면 전달되도록
				String input = inputField.getText();	// 입력한 내용을 가져와서
				mainCon.client.sendMessage(input);		// 메인컨트롤러가 가지는 client객체를 참조하여 sendMessage할수 있도록 호출
				inputField.setText("");					// 입력보냈으니 필드는 글자를 지워준다
				inputField.requestFocus();				// 다시 입력해야 되니까 포커스 요청한다
			}
		});
	}

	public void getMessage(String msg) {
		chatView.appendText(msg + "\n");
	}
}

