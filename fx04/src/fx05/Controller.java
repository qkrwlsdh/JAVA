package fx05;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller implements Initializable {

	@FXML private Text exp;				// form.fxml 에서 참조 가능한 멤버 필드
	@FXML private TextField answer;		// form.fxml 에서 참조 가능한 멤버 필드
	@FXML private Text result;			// result.fxml 에서 참조 가능한 멤버 필드
	private String value = null;
	private int n1, n2;
	
	@FXML private void result(Event e) throws IOException {
		// loader 객체를 별도로 만들어서 새로운 화면을 준비하면
		FXMLLoader loader = new FXMLLoader(getClass().getResource("result.fxml"));
		Parent root = loader.load();
		Stage primaryStage = (Stage)exp.getScene().getWindow();
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("결과 화면");
		primaryStage.show();
		
		// 화면을 다 띄우고 나서 다음 화면의 컨트롤러 객체를 불러온다
		// loader객체에서 불러온 화면의 컨트롤러를 참조할 수 있다
		Controller resultController = loader.getController();
		value = String.format("%d + %d = %s", n1, n2, answer.getText());
		resultController.result.setText(value);
		
		if(answer.getText().equals(Integer.toString(n1 + n2))) {
			resultController.result.setStyle("-fx-fill: blue");
		}
		else {
			resultController.result.setStyle("-fx-fill: red");
		}
	}
	
	@FXML private void back(Event e) {
		System.out.println("back");
	}
	
	private void reload() {
		Random r = new Random();
		int n1 = r.nextInt(9) + 1;
		int n2 = r.nextInt(9) + 1;
		int answer = n1 + n2;
		exp.setText(String.format("%d + %d = ", n1, n2));
		value = String.format("%d + %d = %d", n1, n2, answer);
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		String[] arr = location.getFile().split("/");
		String fxml = arr[arr.length - 1];
		System.out.println(fxml);
		
		if(fxml.equals("form.fxml")) {
			reload();
		}
	}
}
