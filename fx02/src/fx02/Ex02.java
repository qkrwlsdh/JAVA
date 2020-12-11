package fx02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// SceneBuilder로 만든 화면을 JAVA에서 불러오기

public class Ex02 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Ex01.java에서는 프로그램적 디자인, 자바 소스 코드로 모든 디자인을 결정
		// Ex02.java에서는 만들어진 디자인을 불러와서 실행 (Markup Language : 뼈대를 구성하는 형식)
		
		Parent root = FXMLLoader.load(getClass().getResource("fx02.fxml"));
		// 지금 실행하는 클래스 파일의 getResource() 현재 위치에서 자원을 가져온다
		
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("SceneBuilder - Hello, world !");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
/*
 * 프로그램 설치 또는 소스 코드를 작성할 때 피해야할 경로
 * 
 * 1) C:\
 * 2) C:\Users\**
 * 3) C:\Program Files\**
 * 
 * 운영체제 윈도우가 직접 관리하고 제어하는 폴더라서
 * 파일이 열릴려면 윈도우의 권한 허가를 받아야 한다
 */
