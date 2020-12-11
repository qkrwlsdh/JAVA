package ex03;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

// 보여지는 화면(view)에 있는 요소들을 자바 객체로 식별하여 제어하기 위한 클래스
// javaFx의 컨트롤러는 Initializable 인터페이스를 구현한다

public class Controller implements Initializable {
	// view에서 불러온 객체는 멤버 필드로 작성하면서 @FXML을 붙여준다
	@FXML private Text quiz;		// fx:id = "quiz"
	@FXML private TextField field;	// view에서 부여한 fx:id와 멤버 필드의 이름이 일치해야 한다
	@FXML private Text msg;			// 자료형은 javafx패키지 내부의 클래스를 그대로 불러온다
	@FXML private Button confirmBtn;	// <Button fx:id = "confirm" onAction = "#checkAnswer" ...>
	@FXML private Button refreshBtn;
	@FXML private Button exitBtn;
	
	private int n1, n2, answer;
	
	// 확인 버튼에 대응되는 메서드 checkAnswer
	@FXML private void checkAnswer() {
		// 1) 사용자가 입력한 field의 값을 불러온다
		String input = field.getText();
		
		// 2) 사용자가 입력한 값과 프로그램에서 계산한 값이 일치하는지 판단하여
		boolean isAnswer = input.equals(Integer.toString(answer));
		if(isAnswer) {	// 일치할 경우
			msg.setText("정답");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			refresh();
		} else {		// 불일치할 경우
			msg.setText("꿀밤 한대");
		}
	}
	
	// 내부에서만 호출하는 메서드라서 private
	@FXML private void refresh() {
		Random random = new Random();
		n1 = random.nextInt(99) + 1;	// 1 ~ 100
		n2 = random.nextInt(99) + 1;	// 1 ~ 100
		answer = n1 + n2;
		
		quiz.setText(n1 + " + " + n2 + " = ");
		msg.setText("정답을 입력하세요");
		field.setText("");
	}
	
	@FXML private void exit() {
		System.exit(0);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 화면이 불러진 이후 초기 작동을 담당하는 메서드
		refresh();
	}

}
