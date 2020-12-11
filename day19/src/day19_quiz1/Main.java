package day19_quiz1;

public class Main {		// 5개의 보기 중 정답을 입력받기 (시간이 지나면 정답이라도 오답으로 처리하기)
	public static void main(String[] args) {
		
		Timer t = new Timer(5);			// 스레드로 구성할 Runnable 객체(Thread의 재료)
		Thread th = new Thread(t);		// Thread(내부에 Timer가 내제되어 있음)
		Question q = new Question(t);	// q가 t를 참조하게끔
		
		t.setQuestion(q);				// t가 q를 참조하게끔
		
		th.start(); 	// 타이머를 스레드로 실행하고
		q.go();			// 스레드가 아닌 형태의 메서드가 호출되면, 메서드가 종료된 이후 다음 작업을 진행한다
		
		System.err.println(q.isCorrect() ? "정답입니다" : "오답입니다");
	}
}