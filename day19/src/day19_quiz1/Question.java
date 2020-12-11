package day19_quiz1;

import java.util.Scanner;

public class Question {	// 간단한 객관식 문제를 제시하고 정답을 입력받기
	
	private Scanner sc = new Scanner(System.in);
	private Timer t;		// Question이 Timer를 참조할 수 있도록 생성한 변수
	private boolean correct = false;
	private boolean solve = false;
	
	public Question(Timer t) {	// 생성자 매개변수 형식으로 다른 객체를 참조하도록 설정
		this.t = t;
	}
	
	public void go() {
		String context = "다음 중 자바 클래스의 구성 요소가 아닌것은?\r\n" + 
				"	1) 멤버 필드\r\n" + 
				"	2) 멤버 메서드\r\n" + 
				"	3) 포인터\r\n" + 
				"	4) 접근 제한자\r\n" + 
				"	5) 생성자\r\n" + 
				"정답 입력 >>> ";
		
		System.out.print(context);
		int answer = sc.nextInt();	// 정답이든, 오답이든, 입력했다면 solve를 true로 변경한다
		setSolve(true);
//		타이머가 종료되지 않은 상태에서 입력받은 답이 3번이면 정답이다
		if(t.isOver() == false && answer == 3) {
			setCorrect(true);
		}
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public boolean isSolve() {
		return solve;
	}

	public void setSolve(boolean solve) {
		this.solve = solve;
	}
	
	
	// 다음 중 자바 클래스의 구성 요소가 아닌것은?
	// 1) 멤버 필드
	// 2) 멤버 메서드
	// 3) 포인터
	// 4) 접근 제한자
	// 5) 생성자
}
