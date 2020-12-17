package server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// FX 구동 메인 클래스
public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("serverView.fxml"));
		Parent root = loader.load();	// 화면을 불러오면서, 컨트롤러 객체도 자동으로 생성(기본생성자)
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("FX Chat Server (test)");
		primaryStage.show();
		
//		loader.load(); 			// 지정한 fxml 파일을 자바 객체로 변환하여 가장 위에 있는 객체를 Parent 형식으로 반환한다
//		loader.getController();	// 지정한 fxml 파일에 의해 생성된 컨트롤러 객체 참조 주소를 반환한다 (직접 생성 X)
		
		primaryStage.setAlwaysOnTop(true);	// 항상 위에, 다른 윈도우 창에 가려지지 않는다
	}
	
	public static void main(String[] args) {
		launch(args);	
		
		// init() -> start() -> 
		// loader.load() -> Controller() -> con.initialize() -> stage.show()
		// -> stop()
	}
}

