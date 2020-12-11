package ex03;

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
		// view를 fxml형식으로 불러오기 때문에, Main의 구성은 여기서 끝
		Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("두 수의 덧셈을 구할건데 틀리면 꿀밤 한대");
		primaryStage.show();
	}	
}
