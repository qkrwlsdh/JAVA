package day19_ex01;

public class Main {
	public static void main(String[] args) {
		
		Timer t = new Timer(10);
		Input input = new Input(t);
		
//		t.go();		// 타이머 시작
		t.start();
		input.go();
		
	}
}
