package day19_quiz1;

public class Timer implements Runnable {	// implement Runnable 해서 스레드로 작동할수 있는 타이머 구현
	
	private double sec;
	private boolean over;
	private Question q;		// 타이머가 문제를 참조할 수 있도록 설정한 변수
	
	public void setQuestion(Question q) {	// setter를 통해서 다른 객체를 참조할 수 있도록 설정
		this.q = q;
	}
	
	public Timer(double sec) {
		this.sec = sec;
	}
	
	@Override
	public void run() {
		go();
	}
	
	private void go() {	// 외부에서 직접 객체를 통해 호출하는 메서드가 아니라면, private으로 설정할 수 있다
		for(int i = (int)sec; i >= 0; i--) {
			
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
			
			if(q.isSolve() == true) {	// 문제에 대한 답을 입력받았다면
				over = true;			// 타이머 종료 여부를 true로 바꿔두고
				return;					// 타이머 함수 종료
			}
			
			System.out.printf("\t\t[%02d : %02d]\n", i / 60, i % 60);
			
		}
		this.setOver(true);
	}

	

	public boolean isOver() {
		return over;
	}

	public void setOver(boolean over) {
		this.over = over;
	}
	
	
}
