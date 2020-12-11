package fx02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ex01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text("HELLO, JAVAFX !\n");	// text를 만든다
		text.setFont(new Font(30));
		Button btn1 = new Button("확인");				// 버튼 생성
		Button btn2 = new Button("취소");
		btn1.setFont(new Font(20));
		btn2.setFont(new Font(20));
		
		HBox hbox1 = new HBox(btn1, btn2);
		hbox1.setAlignment(Pos.CENTER);
		hbox1.setPrefHeight(100);
		
		
		VBox vbox1 = new VBox(text, hbox1);
		vbox1.setAlignment(Pos.CENTER);
		vbox1.setPrefSize(500, 200);
		
		Scene scene = new Scene(vbox1);		// VBOX를 이용하여 장면 하나를 만든다
		
		
		primaryStage.setScene(scene);				// 만든 장면을 무대에 올린다
		primaryStage.setTitle("JAVAFX를 만들어보자");	// 무대의 제목을 정한다
		primaryStage.show();						// 무대 시작 !
	}
	
	public static void main(String[] args) {
		launch(args);	// 초기화 이후 start()가 호출된다
	}

}
