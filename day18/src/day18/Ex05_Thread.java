package day18;

class MyThread1 extends Thread {
	public void alpha() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
	}
	@Override
	public void run() {
		// Thread 클래스가 가지고 있고, 상속받은 메서드
		// 1) 여기에 동시작업으로 수행하고 싶은 코드를 작성하면 된다
		alpha();
	}
}

public class Ex05_Thread {
	public static void main(String[] args) {
		
		MyThread1 ob = new MyThread1();
//		ob.alpha();
//		ob.run();		// 2) 호출시에는 run()으로 호출하지 않는다
		ob.start();		// 3) start()로 호출하면 별도의 스레드를 생성하여, 그곳에서 수행한다
		
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
		}
		
//		Thread : 하나의 프로그램이 동시에 여러 내용을 처리하고 싶을 때 사용하는 클래스
		
//		초창기의 CPU는 단일코어, 단일스레드의 형태에서 최대 출력을 증가시키는 방향으로 발전했음
//		다수의 코어(물리적인 CPU 유닛)와 다수의 스레드(논리적인 프로그램의 단위)를 활용하여
//		동시에 여러 작업을 처리할 수 있는 형식으로 발전
	}
}
