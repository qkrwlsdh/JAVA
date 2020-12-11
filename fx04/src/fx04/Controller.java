package fx04;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
	@FXML TextField nameField;
	@FXML TextField ageField;
	@FXML Text result;
	
//	private boolean checkNum(String value) {		// 숫자만 입력받게해주는 메서드
//		// String은 연속된 char로 구성되어 있다
//		for(int i = 0; i < value.length(); i++) {
//			char ch = value.charAt(i);
//			if(ch < '0' || '9' < ch) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	
	private boolean checkField() {
		// 1) 모든 값이 입력되었는지
		if("".equals(nameField.getText())) {
			System.out.println("이름 필드가 입력되어야 합니다");
			nameField.requestFocus();	// 지정한 필드에 커서가 위치하도록 포커스해준다
			return false;
		}
		else if("".equals(ageField.getText())) {
			System.out.println("나이 필드가 입력되어야 합니다");
			ageField.requestFocus();	// 지정한 필드에 커서가 위치하도록 포커스해준다
			return false;
		}
//		else if(checkNum(ageField.getText()) == false) {
//			System.out.println("나이 필드가 정수로 구성되지 않았음");
//			ageField.requestFocus();
//			return false;
//		}
		try {	
		Integer.parseInt(ageField.getText());
		} catch(NumberFormatException e) {
			System.out.println("나이 필드가 정수로 구성되지 않았음");
			ageField.requestFocus();
			return false;
		}
		return true;
	}
	
	@FXML private void back() throws Exception {
		Stage primaryStage = (Stage)result.getScene().getWindow();
		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("form.fxml")));
		primaryStage.setScene(scene);
		primaryStage.setTitle("결과 출력");
		
		primaryStage.show();
	}
	
	@FXML private void result() throws Exception{
		if(checkField() == false) {
			
			return;		// 현재 진행중인 메서드의 즉각적인 종료
		}
		
		Stage primaryStage = (Stage)nameField.getScene().getWindow();
		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("result.fxml")));
		primaryStage.setScene(scene);
		primaryStage.setTitle("결과 출력");
		primaryStage.show();
		
		VBox root = (VBox)scene.getRoot();
		HBox box1 = (HBox)root.getChildren().get(1);
		Text msg = (Text)box1.getChildren().get(0);
		System.out.println(msg);
		msg.setText(String.format("%s님은 %s살이시군요", nameField.getText(), ageField.getText()));
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String[] arr = location.getFile().split("/");
		String fxml = arr[arr.length - 1];
		System.out.println("컨트롤러 초기화 완료 ! : " + fxml);
		System.out.println(this);
		
//		if(fxml.equals("result.fxml")) {
//			String msg = "여기에 결과를 넣어주면 됩니다";
			// result.fxml에서는 fx:id="nameField"가 없다 (ageField도 없다)
//			msg = String.format("%s님은 %d살입니다", nameField.getText(), ageField.getText());
//			result.setText(msg);
//		}
	}

}
