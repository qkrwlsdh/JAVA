package fx01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// 1) javaFx의 모든 기본 내용을 가지는 Application이라는 클래스를 상속받으면 된다
// 2) 미구현 메서드를 생성 (형식은 일치 시키고 오버라이딩 하게끔)
// 3) 메인 함수 작성 - launch(args);
public class First extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text("첫번째 FX 프로그램");
		text.setFont(new Font("210 콤퓨타세탁", 30));
		
		Button btn1 = new Button("확인");		// 버튼 생성
		Button btn2 = new Button("취소");
		
		HBox hbox1 = new HBox(btn1, btn2);	// 버튼1과 버튼2를 박스에 넣는다
		hbox1.setAlignment(Pos.CENTER);		// 박스의 정렬은 가운데 정렬
		hbox1.setPrefHeight(100);
		
		VBox vbox1 = new VBox(text, hbox1);	// 글자와 버튼이 담긴 박스를 담아서 새로운 박스
		vbox1.setAlignment(Pos.CENTER);		// 가운데 정렬
		vbox1.setPrefSize(500, 200);		// 박스의 크기는 가로 300px, 세로 200px
		
		// 무대에 장면을 세팅, 제목을 세팅하고, show();
		primaryStage.setScene(new Scene(vbox1));
		primaryStage.setTitle("제목 표시줄");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
