package day19_ex01;

// 생성자로 정수 혹은 실수를 전달받아서, 지정된 초만큼 타이머를 측정하고
// 타이머 시간이 종료됨을 다른 객체에게 알려줄 수 있는 스레드 클래스

public class Timer extends Thread{
//	내가 직접 Thread를 활용한 다중 작업을 구성할 줄 몰라도
//	Thread 클래스를 상속받으면, Thread에 필요한 구성요소가 모두 들어온다 (상속받아서)

	@Override
	public void run() {
		go();
	}

	private double second;
	private boolean isOver;

	public Timer(double second) {
		this.second = second;
	}

	public void go() {
		for (int i = (int) second; i >= 0; i--) {
			
			try {
			Thread.sleep(1000);		// CPU에게 1초만 기다려라고 전달하는 메서드
			} catch (Exception e) {}
			System.out.printf("[%02d : %02d]\n", i / 60, i % 60);
		}
		System.out.println();
		isOver = true;
	}

	public boolean isOver() {	// getter이지만 boolean형태이므로 isOver
		return isOver;
	}

	public void setOver(boolean isOver) {
		this.isOver = isOver;
	}
}
