package client;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	Controller con;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("clientView.fxml"));
		Parent root = loader.load();
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("FX Chat Client (test)");
		primaryStage.show();
		
		primaryStage.setAlwaysOnTop(true);
		con = loader.getController();
	}
	
	@Override
	public void stop() throws IOException {
		// FX 창이 종료되면 수행하는 내용
		if(con.so != null) con.so.close();
		System.out.println("창을 닫기전에 stop을 호출했습니다 !!");
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}

