package fx03_login;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller implements Initializable{
	@FXML TextField idField;
	@FXML PasswordField pwField;
	@FXML Button loginBtn;
	@FXML Text msg;
	
	private ArrayList<Member>list = new ArrayList<Member>();
	// 프로그램 내부에서 사용할 데이터의 단위 유닛을 정의하는 클래스가 필요하다
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		System.out.println("컨트롤러 초기화!");
		System.out.println("location : " + location);
		System.out.println("resources : " + resources);
		System.out.println(idField.getFont());
		
		list.add(new Member("jinoh1276", "1234", "박진오"));
		list.add(new Member("waegi123", "1234", "최슬비"));
		list.add(new Member("jjgod1276", "1234", "진오박"));
		
		msg.setText("계정과 비밀번호를 입력하여 로그인하세요 !");
	}
	
	@FXML
	private void login(Event e) {
		System.out.println(e.getSource());
		System.out.println(e.getEventType());
		System.out.println(e.getTarget());
		if(e.getSource() instanceof PasswordField) {		// 만약 이벤트의 원 소스가 passwordField라면
			System.out.println(((KeyEvent)e).getCode());	// 이벤트의 형식을 keyEvent라고 자료형변환하고 코드를 출력
		
			if(((KeyEvent)e).getCode() == KeyCode.ESCAPE) {
				pwField.setText("");
				return;
			}
			
			if(((KeyEvent)e).getCode() != KeyCode.ENTER)
			return;
		}
		System.out.println();
		
		String userid = idField.getText();
		String userpw = pwField.getText();
		
		boolean flag = false;	// 로그인에 성공했다면 true로 바꿀 값
		
		for(Member mem : list) {
			if(mem.getUserid().equals(userid) && mem.getUserpw().equals(userpw)) {
				msg.setText(mem.getUsername() + "님 환영합니다");
				flag = true;
				break;
			}
		}
		if(flag == false) {
			msg.setText("일치하는 계정 정보를 찾을 수 없습니다 !");
		}
	}

}
