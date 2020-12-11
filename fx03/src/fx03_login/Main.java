package fx03_login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("view2.fxml"));
		/*
		 * URL fxml = getClass().getResource("view2.fxml"));
		 * Parent root = FXMLLoader.load(fxml);
		 */
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("로그인을 해보세요. 아무것도 없습니다");
		primaryStage.show();
	}
}
