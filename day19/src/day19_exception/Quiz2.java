package day19_exception;

class Timer{
	private int sec = 5;
	public void go() throws InterruptedException {
		for(int i = sec; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.printf("[%02d : %02d]\n", i / 60, i % 60);
		}
	}
}
// 현재 코드에서 try ~ catch를 사용하지 않고 실행할 수 있도록 변경해보세요
public class Quiz2 {
	public static void main(String[] args) throws InterruptedException {
		new Timer().go();
	}
}
